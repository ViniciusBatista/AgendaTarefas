/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *http://www.caelum.com.br/apostila-java-web/bancos-de-dados-e-jdbc/#2-11-exercicios-javabeans-e-contatodao
 * @author batista
 */

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    public static Connection con;

    public Conexao() {
    }

    public static void conecte() {
        String Driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "918171";
        String url = "jdbc:postgresql://localhost:5432/agenda";

        try {
            Class.forName(Driver);

            con = (Connection) DriverManager.getConnection(url, user, senha);
           // System.out.println("Conexão realizada com sucesso");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void execute(String sql) {
        try {
            PreparedStatement stmt = con.prepareCall(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static ResultSet executeQuery(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    //método para inserir nova tarefa no banco
    public static void adiciona(Tarefa tarefa) {
        String INSERT = "insert into agenda_tarefa (descr, data_hora_entrada, data_vencimento, hora_vencimento)"
                + "values (?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(INSERT);
            stmt.setString(1, tarefa.getDescr());
            stmt.setTimestamp(2, new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis()));
            stmt.setTimestamp(3, new java.sql.Timestamp (tarefa.getData_vencimento().getTime()));
            stmt.setTime(4, new java.sql.Time(tarefa.getHora_vencimento().getTime()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //método para remover uma linha da tabela 
    public static void remover (int id){
        String DELETE = "delete from agenda_tarefa where id = ?";
        try {
            PreparedStatement  stmt = con.prepareCall(DELETE);
            stmt.setLong(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            System.err.println("erro ao remover" + e.getMessage());
        }
    }
        public static void update (int id){
            String UPDATE = "update agenda_tarefa set data_final = now() where id = ?";
            try{
                PreparedStatement stmt = con.prepareCall(UPDATE);
                stmt.setLong(1, id);
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                System.err.println("Erro no update" + e.getMessage());
            }
        }
    }


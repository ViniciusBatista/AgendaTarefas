/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author batista
 */
public class Agenda {

    /**
     * @param dataEntrada
     * @param dataVencimento
     * @return
     */
    public static boolean verificaVencimento(Date dataEntrada, Date dataVencimento) {//Método para ser testado
        if (dataEntrada.before(dataVencimento)) {
            return true;
        } else if (dataEntrada.after(dataVencimento)) {
            return false;
        } else {
            return true;
        }
    }

    //Método para inserir nova tarefa no banco
    public static void inserirNovaTarefa(String descr, String data_ven, String hora_ven) throws Exception{
        Tarefa tarefa = new Tarefa();
        tarefa.setDescr(descr);
        Date data = new Date();
        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(data_ven);
            
            if (data.after(new Date())){//Conferi se a data do vencimento já passou
                tarefa.setData_vencimento(data);
            }else {
                throw new Exception();
            }
        } catch (ParseException pe) {
            System.out.println(pe.getMessage());
        }
        tarefa.setHora_vencimento(Time.valueOf(hora_ven));
        Conexao.conecte();
        Conexao.adiciona(tarefa);
    }
    
   
    public static ArrayList<Tarefa> consultaTarefas(){
        ArrayList<Tarefa> Tarefas = new ArrayList<Tarefa>();
        String SELECT = "select id, descr, data_hora_entrada, data_vencimento, hora_vencimento from agenda_tarefa where data_final is null order by data_vencimento;";
            try{
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()){
                Tarefa tf = new Tarefa();
                tf.setId(rs.getInt("id"));
                tf.setDescr(rs.getString("descr"));
                tf.setData_hora_entrada(rs.getTimestamp("data_hora_entrada"));
                tf.setData_vencimento(rs.getDate("data_vencimento"));
                tf.setHora_vencimento(rs.getTime("hora_vencimento"));
                Tarefas.add(tf);
            }
            }catch(SQLException e){
                System.err.println(e.getMessage());
            }
            return Tarefas;
    }
    
    public static ArrayList<Tarefa> consultaTarefasAntigas(){
        ArrayList<Tarefa> Tarefas = new ArrayList<Tarefa>();
        String SELECT = "select id, descr, data_hora_entrada, data_vencimento, hora_vencimento from agenda_tarefa where data_final is not null;";
            try{
            Conexao.conecte();
            ResultSet rs = Conexao.executeQuery(SELECT);
            while (rs.next()){
                Tarefa tf = new Tarefa();
                tf.setId(rs.getInt("id"));
                tf.setDescr(rs.getString("descr"));
                tf.setData_hora_entrada(rs.getTimestamp("data_hora_entrada"));
                tf.setData_vencimento(rs.getDate("data_vencimento"));
                tf.setHora_vencimento(rs.getTime("hora_vencimento"));
                Tarefas.add(tf);
            }
            }catch(SQLException e){
                System.err.println(e.getMessage());
            }
            return Tarefas;
    }
    
    public static void delete(int id){
        Conexao.conecte();
        Conexao.remover(id);
    }

    public static void concluirTarefa(int id){
        Conexao.conecte();
        Conexao.update(id);
    }
    
    public static void main(String[] args) {
       FramePrincipal frameP = new FramePrincipal();
       frameP.setVisible(true);

      //  inserirNovaTarefa("testando novamente", "08/09/2015", "13:09:00");
    }

}

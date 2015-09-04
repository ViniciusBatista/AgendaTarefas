/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author batista
 */
public class Tarefa {
    private int id;
    private String descr;
    private Date data_hora_entrada;
    private Date data_vencimento = new Date();
    private Time hora_vencimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getData_hora_entrada() {
        return data_hora_entrada;
    }

    public void setData_hora_entrada(Date data_hora_entrada) {
        this.data_hora_entrada = data_hora_entrada;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Time getHora_vencimento() {
        return hora_vencimento;
    }

    public void setHora_vencimento(Time hora_vencimento) {
        this.hora_vencimento = hora_vencimento;
    }

   

    
    
}

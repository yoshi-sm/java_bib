/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pedro
 */
public class Evento {
    
    private String nome;    
    private String data;
    private String assunto;
    private EspacoEvento espacoEvento;
    
    public Evento() {}
    
    public Evento(String nome, String data, String assunto) {
        this.nome = nome;
        this.data = data;        
        this.assunto = assunto;        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    public EspacoEvento getEspacoEvento() {
        return espacoEvento;
    }

    public void setEspacoEvento(EspacoEvento espacoEvento) {
        this.espacoEvento = espacoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", espacoEvento=" + espacoEvento + ", data=" + data + ", assunto=" + assunto + '}';
    }    
  
}

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
    private String local;
    private String data;
    
    public Evento() {}
    
    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Evento: " + "Nome do evento= " + nome + ", Local do evento= " + local + ", Data do evento= " + data;
    }
    
    
}

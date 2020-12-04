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
public class EspacoEvento {
    
    private String nome;
    private String local;
    
    public EspacoEvento() {}
    
    public EspacoEvento(String nome, String local) {
        this.nome = nome;
        this.local = local;
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

    @Override
    public String toString() {
        return "espacoEvento{" + "nome=" + nome + ", local=" + local + '}';
    }

}

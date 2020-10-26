/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author xiuki
 */
public class Livro {
    
    private String titulo;
    private int id;
    private boolean alugado;
    private String devolucao;
    private boolean reservado;
    private String nomeUsuario;
    
    
    //construtores
    public Livro(){}
    
    public Livro(String t){
    
    this.titulo = t;
    this.id = 0;
    this.alugado = false;
    this.devolucao = "";
    this.reservado = false;
    this.nomeUsuario = "";
    }

    
    //get & set & toString

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public boolean isReservado() {
        return reservado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void setNomeUsuario(String nome_usuario) {
        this.nomeUsuario = nome_usuario;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", id=" + id + ", alugado=" + alugado +
                ", devolucao=" + devolucao + ", reservado=" + reservado + ", nome_usuario="
                + nomeUsuario + '}' + "\n";
    }

    
    
    
    
    
    
}

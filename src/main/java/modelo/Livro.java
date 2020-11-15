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
    private String autor;
    private int id;
    private boolean alugado;
    private String devolucao;
    private boolean reservado;
    private String nomeUsuario;
    
    
    //construtores
    public Livro(){}
    
    public Livro(String t, String a){
    
    this.titulo = t;
    this.autor = a;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", id=" + id + ", alugado=" + alugado + ", devolucao=" + devolucao + ", reservado=" + reservado + ", nomeUsuario=" + nomeUsuario + '}';
    }
    
 
    }

    
    
    
    
    
    


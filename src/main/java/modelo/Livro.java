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
    this.devolucao = "---";
    this.reservado = false;
    this.nomeUsuario = "---";
    }
    
    public Livro(String t, 
            String a, 
            boolean alg, 
            String devol, 
            boolean res, 
            String usr){
    
    this.titulo = t;
    this.autor = a;
    this.id = 0;
    this.alugado = alg;
    this.devolucao = devol;
    this.reservado = res;
    this.nomeUsuario = usr;
    }

    

    //metodos
    
    
    //verifica igualdade entre 2 livros
    public boolean igual(Livro livro){
        if( this.titulo.equals(livro.getTitulo()) &&
            this.autor.equals(livro.getAutor()) &&
            this.id == livro.getId()&&
            this.alugado == livro.isAlugado() &&
            this.devolucao.equals(livro.getDevolucao()) &&
            this.reservado == livro.isReservado() &&
            this.nomeUsuario.equals(livro.getNomeUsuario())){
            return true;
        }
        else{
            return false;
        }
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

   
        //return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", id=" + id + ", 
        //alugado=" + alugado + ", devolucao=" + devolucao + ", reservado=" + reservado + ", 
        //nomeUsuario=" + nomeUsuario + '}';
    
    @Override
    public String toString() {
        if(alugado){
        return "Titulo: " + titulo + ", Autor: " + autor + ", ID: " + id + 
                ", Alugado: Sim, Devolucao: " + devolucao + ", Reservado: -, Usuario: " 
                + nomeUsuario+"\n";
        }
        else{
            if(reservado){
                return "Titulo: " + titulo + ", Autor: " + autor + ", ID: " + id + 
                ", Alugado: Não, Devolucao: " + devolucao + ", Reservado: Sim, Usuario: " + nomeUsuario+"\n";
            }
            else{
                return "Titulo: " + titulo + ", Autor: " + autor + ", ID: " + id + 
                ", Alugado: Não, Devolucao: " + devolucao + ", Reservado: Não, Usuario: "+ nomeUsuario+"\n";
            }
        }
    }
 
   
    }

    
    
    
    
    
    


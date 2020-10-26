/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author xiuki
 */
public class ListaLivro {
    
    private ArrayList<Livro> lista;
    
    public ListaLivro(){}
    
    public ListaLivro(ArrayList<Livro> l){
    this.lista = l;
    }
    //metodos
    
        //adiciona livro à lista e adiciona um id único ao livro.
    public void addLivro(Livro livro){
        livro.setId(this.lista.size());
        this.lista.add(livro);
        }
    
        //tenta reservar um livro settando atributos no objeto livro, retorna t ou f.
    public boolean reservar(Livro livro, String nome_usuario){
        if (this.lista.contains(livro)){    
            if (livro.isAlugado() || livro.isReservado()){
                return false;
            }
            else{
                livro.setReservado(true);
                livro.setNomeUsuario(nome_usuario);
                return true;
            }
        }
        else{
            return false;
        }
    }
    
    
    
        //tenta alugar um livro settando atributos no objeto livro, retorna t ou f.
    public boolean alugar(Livro livro, String dataDevolucao, String nome_usuario){    
        if (this.lista.contains(livro)){    
            if (livro.isAlugado() || livro.isReservado()){
                return false;
            }
            else{
                livro.setAlugado(true);
                livro.setNomeUsuario(nome_usuario);
                livro.setDevolucao(dataDevolucao);
                //int temp = this.lista.indexOf(livro);
                //this.lista.set(temp, livro);
                return true;
            }
        }
        else{
            return false;
        }
    }
    
        //tenta retornar um livro alugado ou reservad. Retorna t ou f.
    public boolean retornarLivro(Livro livro){
        if (this.lista.contains(livro)){
            if (livro.isAlugado() || livro.isReservado()){
                //int temp = this.lista.indexOf(livro);
                livro.setAlugado(false);
                livro.setReservado(false);
                livro.setNomeUsuario("");
                livro.setDevolucao("");
                //this.lista.set(temp, livro);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
        //Funcao auxiliadora do metodo de busca.
    public void aux(Livro t1, String t2, ArrayList<Livro> t3){
        if (t1.getTitulo().equals(t2)){
        t3.add(t1);
        }
    }
    
        //Metodo de busca de livros por titulo. Retorna um arraylist.
    public ArrayList<Livro> buscaLivro(String titulo){
        ArrayList<Livro> temp = new ArrayList<>();
        this.lista.forEach((n) -> aux(n, titulo, temp));
        return temp;
    }
    
    //get & set & toString

    public ArrayList<Livro> getLista() {
        return lista;
    }

    public void setListaDeLivro(ArrayList<Livro> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaLivro{\n" + "listaDeLivro=\n" + lista + '}';
    }
    
}

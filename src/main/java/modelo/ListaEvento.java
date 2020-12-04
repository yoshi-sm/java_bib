/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ListaEvento {
    
    private ArrayList<Evento> lista;
    
    public ListaEvento(){}
    
    public ListaEvento(ArrayList<Evento> lista) {
        this.lista = lista;
    }
    
    // Talvez checar por data e local, ao invés de nome
    public boolean eventoExiste(String nomeEvento) {
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nomeEvento)){
                temp = true;
            }
        }
        return temp;
    }
    
    //carrega a lista de eventos de um arquivo "arquivos/eventos.txt"
    public void carregarEventos(){
        String temp;
        Scanner leitor;
        Evento evento;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/eventos.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                evento = new Evento(temp2[0], temp2[1], temp2[2], temp2[3]);
                this.lista.add(evento);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    
    //salva os eventos do objeto para o arquivo, objeto é esvaziado depois
    public void salvarEvento(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getNome()+"%##%"+
                    this.lista.get(i).getLocal()+"%##%"+
                    this.lista.get(i).getData()+"%##%"+
                    this.lista.get(i).getAssunto()+"\n";
        
        }
        try {
            conteudo = new FileWriter("arquivos/eventos.txt");
            conteudo.write(temp);
            conteudo.close();
            System.out.println("Lista salva!");
            this.lista.clear();
        } 
        catch (IOException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    
    //adiciona evento à lista. Se o evento ja existe retorna falso
    public boolean cadastrar(Evento evento){
        boolean bool = true;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(evento.getNome())){
                bool = false;
            }
        }
        if (bool){
            this.lista.add(evento);
        }
        return bool;
    }
   
    //removendo evento à lista
    public boolean remover(String nomeEvento){
        boolean temp = false;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nomeEvento)){
                this.lista.remove(i);
                temp = true;
            }
        }
        return temp;
    }

    public ArrayList<Evento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Evento> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista de eventos= " + lista;
    }
    
}

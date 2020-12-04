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
 * @author mac
 */
public class ListaEspacoEvento {
    
    private ArrayList<EspacoEvento> lista;
    
    public ListaEspacoEvento(){}
    
    public ListaEspacoEvento(ArrayList<EspacoEvento> lista) {
        this.lista = lista;
    }
    
    //verifica se o Espaco existe existe 
    public boolean existe(String nome){
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nome)){
                temp = true;
            }
        }
        return temp;
    }
    
    //verifica se o usuario existe 
    public EspacoEvento carregarEspacoEvento(String nome){
        EspacoEvento temp = new EspacoEvento();
        for(int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nome)){
               temp.setNome(this.lista.get(i).getNome());
               temp.setLocal(this.lista.get(i).getLocal());
            }
        }
        return temp;
    }
    
    public void carregarEspacoEventos(){
        String temp;
        Scanner leitor;
        EspacoEvento espacoEvento;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/espacoEventos.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                espacoEvento = new EspacoEvento(temp2[0], temp2[1]);
                this.lista.add(espacoEvento);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    
    //carrega a lista de eventos de um arquivo "arquivos/eventos.txt"
    public void salvarEspacoEvento(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getNome()+"%##%"+
                    this.lista.get(i).getLocal()+"%##%\n";
        
        }
        try {
            conteudo = new FileWriter("arquivos/espacoEventos.txt");
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
    public boolean cadastrar(EspacoEvento espacoEvento){
        boolean bool = true;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(espacoEvento.getNome())){
                bool = false;
            }
        }
        if (bool){
            this.lista.add(espacoEvento);
        }
        return bool;
    }
   
    //removendo evento à lista
    public boolean remover(String nomeEspacoEvento){
        boolean temp = false;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nomeEspacoEvento)){
                this.lista.remove(i);
                temp = true;
            }
        }
        return temp;
    }

    public ArrayList<EspacoEvento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<EspacoEvento> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaEspacoEvento{" + "lista=" + lista + '}';
    }
    
    
}

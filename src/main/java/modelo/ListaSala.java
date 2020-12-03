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
public class ListaSala {
    
    private ArrayList<Sala> lista;
    
    public ListaSala(){}
    
    public ListaSala(ArrayList<Sala> lista) {
        this.lista = lista;
    }
    
    // Checa se a sala em questão está alugada
    public boolean isSalaAlugada(int numeroSala) {
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getAlugado()){
                temp = true;
            }
        }
        return temp;
    }
    
    //carrega a lista de salas de um arquivo "arquivos/eventos.txt"
    public void carregarSalas(){
        String temp;
        Scanner leitor;
        Sala sala;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/salas.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                sala = new Sala(temp2[0]);
                this.lista.add(sala);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    
    //salva as salas do objeto para o arquivo, objeto é esvaziado depois
    public void salvarSala(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getNome()+"%##%";
        
        }
        try {
            conteudo = new FileWriter("arquivos/salas.txt");
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
    
    //adiciona sala à lista. Se a sala ja existe retorna falso
    public boolean cadastrar(Sala sala){
        boolean bool = true;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(sala.getNome())){
                bool = false;
            }
        }
        if (bool){
            this.lista.add(sala);
        }
        return bool;
    }
   
    //removendo sala da lista
    public boolean remover(String nome){
        boolean temp = false;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNome().equals(nome)){
                this.lista.remove(i);
                temp = true;
            }
        }
        return temp;
    }
}

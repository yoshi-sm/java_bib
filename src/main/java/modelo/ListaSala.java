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
    
    //carrega a lista de salas de um arquivo "arquivos/salas.txt"
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
                temp2 = temp.split("%##%", 5);
                sala = new Sala(temp2[0]);
                sala.setAlugado(Boolean.parseBoolean(temp2[1]));
                sala.setAlugador(temp2[2]);
                sala.setData(temp2[3]);
                sala.setHorario(temp2[4]);
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
    public void salvarSalas(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getNome()+"%##%"+
                    this.lista.get(i).getAlugado()+"%##%"+
                    this.lista.get(i).getAlugador()+"%##%"+
                    this.lista.get(i).getData()+"%##%"+
                    this.lista.get(i).getHorario()+"\n";
        
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
        String nome, data, horario;
        nome = sala.getNome();
        data = sala.getData();
        horario = sala.getHorario();
        for (int i = 0; i < this.lista.size(); i++){
            if (    
                    this.lista.get(i).getNome().equals(nome)
                    && this.lista.get(i).getData().equals(data)
                    && this.lista.get(i).getHorario().equals(horario)
                ){
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

    public ArrayList<Sala> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Sala> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaSala{" + "lista=" + lista + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;
/**
 *
 * @author xiuki
 */
public class ListaCatal {
    
    private ArrayList<Catalografica> lista;
    
    public ListaCatal(){}
    
    public ListaCatal(ArrayList<Catalografica> lista){
    this.lista = lista;
    }
    
   
    
    // carrega fichas catalograficas de um arquivo de texto em arquivos/pedidos.txt
    public void carregarPedidos(){
        String temp;
        Catalografica a1;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/pedidos.txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
              temp = leitor.nextLine();
              temp2 = temp.split("%##%", 12);
              a1 = new Catalografica(temp2[0], temp2[1], temp2[2],
                      temp2[3],temp2[4], temp2[5], temp2[6], temp2[7], temp2[8],
                       temp2[9], temp2[10], temp2[11]);
              //System.out.println(a1);
              this.lista.add(a1);
            }
            leitor.close();
            
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
        //System.out.print(this);
    }
        
    // salva as fichas do objeto para o arquivo, objeto é esvaziado depois.
    public void salvarPedidos(){
        String temp = "";
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getTitulo()+"%##%"+
                    this.lista.get(i).getSubtitulo()+"%##%"+
                    this.lista.get(i).getAutor()+"%##%"+
                    this.lista.get(i).getIsbn()+"%##%"+
                    this.lista.get(i).getAssuntos()+"%##%"+
                    this.lista.get(i).getEdicao()+"%##%"+
                    this.lista.get(i).getEditora()+"%##%"+
                    this.lista.get(i).getLocal()+"%##%"+
                    this.lista.get(i).getPaginas()+"%##%"+
                    this.lista.get(i).getCdd()+"%##%"+
                    this.lista.get(i).getCdu()+"%##%"+                   
                    this.lista.get(i).getNomeUsuario()+"\n";
        
        }
        try {
            FileWriter conteudo = new FileWriter("arquivos/pedidos.txt");
            conteudo.write(temp);
            conteudo.close();
            System.out.println("Lista salva!");
            this.lista.clear();
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void gerarFicha(int indice){
        String temp = "";
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getTitulo()+"%##%"+
                    this.lista.get(i).getSubtitulo()+"%##%"+
                    this.lista.get(i).getAutor()+"%##%"+
                    this.lista.get(i).getIsbn()+"%##%"+
                    this.lista.get(i).getAssuntos()+"%##%"+
                    this.lista.get(i).getEdicao()+"%##%"+
                    this.lista.get(i).getEditora()+"%##%"+
                    this.lista.get(i).getLocal()+"%##%"+
                    this.lista.get(i).getPaginas()+"%##%"+
                    this.lista.get(i).getCdd()+"%##%"+
                    this.lista.get(i).getCdu()+"%##%"+                   
                    this.lista.get(i).getNomeUsuario()+"\n";
        
        }
        try {
            FileWriter conteudo = new FileWriter("arquivos/"+
                       this.lista.get(indice).getNomeUsuario()+
                       this.lista.get(indice).getTitulo()+".txt");
            conteudo.write(temp);
            conteudo.close();
            System.out.println("Lista salva!");
            this.lista.remove(indice);
            this.salvarPedidos();
            this.lista.clear();
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
    
    public boolean visualizar(String userName, String titulo){
        String temp;
        boolean result = true;
        Catalografica a1;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/"+userName+titulo+".txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
              temp = leitor.nextLine();
              temp2 = temp.split("%##%", 12);
              a1 = new Catalografica(temp2[0], temp2[1], temp2[2],
                      temp2[3],temp2[4], temp2[5], temp2[6], temp2[7], temp2[8],
                       temp2[9], temp2[10], temp2[11]);
              //System.out.println(a1);
              this.lista.add(a1);
            
            }
            leitor.close();
            
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
            result = false;
        }
        //System.out.print(this);
        return result;
    }

    public ArrayList<Catalografica> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Catalografica> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaCatal{" + "lista=" + lista + '}';
    }
    
    
}

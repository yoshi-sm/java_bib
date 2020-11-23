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
    
    // carrega livros de um arquivo de texto em arquivos/livros.txt
    public void carregarLivros(){
        String temp;
        Livro a1;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/livros.txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
              temp = leitor.nextLine();
              temp2 = temp.split("%##%", 6);
              a1 = new Livro(temp2[0], temp2[1], Boolean.parseBoolean(temp2[2]),
                      temp2[3], Boolean.parseBoolean(temp2[4]), temp2[5]);
              //System.out.println(a1);
              this.addLivro(a1);
            }
            leitor.close();
            
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
        //System.out.print(this);
    }
        
    // salva os livro do objeto para o arquivo, objeto é esvaziado depois.
    public void salvarLivros(){
        String temp = "";
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getTitulo()+"%##%"+
                    this.lista.get(i).getAutor()+"%##%"+
                    this.lista.get(i).isAlugado()+"%##%"+
                    this.lista.get(i).getDevolucao()+"%##%"+
                    this.lista.get(i).isReservado()+"%##%"+                   
                    this.lista.get(i).getNomeUsuario()+"\n";
        
        }
        try {
            FileWriter conteudo = new FileWriter("arquivos/livros.txt");
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
    
    
    //tenta reservar um livro settando atributos no objeto livro, retorna t ou f.
    public boolean reservar(Livro livro, String nome_usuario){
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){    
            if (this.lista.get(i).igual(livro)){
                this.lista.get(i).setReservado(true);
                this.lista.get(i).setNomeUsuario(nome_usuario);
                
                temp = true;
                
            }
        }
        return temp;
    }
    
    
    
    //tenta alugar um livro settando atributos no objeto livro, retorna t ou f.
    public boolean alugar(Livro livro, String dataDevolucao, String nome_usuario){    
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){    
            if (this.lista.get(i).igual(livro)){
                this.lista.get(i).setAlugado(true);
                this.lista.get(i).setNomeUsuario(nome_usuario);
                this.lista.get(i).setDevolucao(dataDevolucao);
                temp = true;
                
            }
        }
        return temp;
    }
    /*public boolean alugar(Livro livro, String dataDevolucao, String nome_usuario){    
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
    }*/
    
        //tenta retornar um livro alugado ou reservad. Retorna t ou f.
    public boolean retornarLivro(Livro livro){
        if (this.lista.contains(livro)){
            if (livro.isAlugado() || livro.isReservado()){
                //int temp = this.lista.indexOf(livro);
                livro.setAlugado(false);
                livro.setReservado(false);
                livro.setNomeUsuario("---");
                livro.setDevolucao("---");
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

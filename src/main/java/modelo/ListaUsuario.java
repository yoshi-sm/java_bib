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
public class ListaUsuario {
    
    private ArrayList<Usuario> lista;
    
    
//Construtores    
    public ListaUsuario(){}
    
    public ListaUsuario(ArrayList<Usuario> l){
    this.lista = l;
    }

    
//Metodos
    
    //verifica se o usuario existe 
        public boolean existe(String usrName){
        boolean temp = false;
        for(int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNomeUsuario().equals(usrName)){
                temp = true;
            }
        }
        return temp;
    }
    
    //carrega a lista de usuarios de um arquivo "arquivos/usuarios.txt"
    public void carregarUsuarios(){
        String temp;
        Scanner leitor;
        Usuario usr;
        String[] temp2;
        try{
            File arquivo = new File("arquivos/usuarios.txt");
            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                temp = leitor.nextLine();
                temp2 = temp.split("%##%", 4);
                System.out.print(temp2[0]);
                usr = new Usuario(temp2[0], temp2[1], temp2[2], temp2[3].charAt(0));
                this.lista.add(usr);
            }
            leitor.close();
        }
      
        catch (FileNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
    
    //salva os usuarios do objeto para o arquivo, objeto é esvaziado depois
    public void salvarUsuarios(){
        String temp = "";
        FileWriter conteudo;
        for(int i = 0; i < this.lista.size(); i++){
            temp += this.lista.get(i).getNome()+"%##%"+
                    this.lista.get(i).getNomeUsuario()+"%##%"+
                    this.lista.get(i).getSenha()+"%##%"+
                    this.lista.get(i).getPermissao()+"\n";
        
        }
        try {
            conteudo = new FileWriter("arquivos/usuarios.txt");
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
    
    //realiza login, retorna -1 para falha, ou o indice do usuario para sucesso.
    public int login(String nomeUsuario, String senha){
        int temp = -1;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNomeUsuario().equals(nomeUsuario) &&
                    this.lista.get(i).getSenha().equals(senha)){
                temp = i;
            }
        }
        
        return temp;
    }
    
        
    //adiciona usuario à lista. Se nome de usuario ja existe retorna falso
    public boolean cadastrar(Usuario usuario){
        boolean bool = true;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNomeUsuario().equals(usuario.getNomeUsuario())){
                bool = false;
            }
        }
        if (bool){
            this.lista.add(usuario);
        }
        return bool;
    }
   
    //removendo usuario à lista
    public boolean remover(String nomeUsuario){
        boolean temp = false;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNomeUsuario().equals(nomeUsuario)){
                this.lista.remove(i);
                temp = true;
            }
        }
        return temp;
    }
    
    //Get & Set & toString()
    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaUsuario{" + "lista=" + lista + '}';
    }
    
}

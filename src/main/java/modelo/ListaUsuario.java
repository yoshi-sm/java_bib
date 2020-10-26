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
public class ListaUsuario {
    
    private ArrayList<Usuario> lista;
    
    
//Construtores    
    public ListaUsuario(){}
    
    public ListaUsuario(ArrayList<Usuario> l){
    this.lista = l;
    }

    
//Metodos
    
    public void auxLogin(Usuario u, String nU, String s, int temp){
        if (u.getNomeUsuario().equals(nU) && u.getSenha().equals(s)){
            temp = this.lista.indexOf(u);
        }
    }
    
    
    //metodo login, retorna o indice do usuario na listaUsuario
    public int login(String nomeUsuario, String senha){
        int temp = -1;
        this.lista.forEach((n) -> auxLogin(n, nomeUsuario, senha, temp));
        return temp;
    }
    
    
    //funcao auxiliar do metodo adicionar
    public void auxCadastrar(Usuario u, String s, boolean bool){
        if(u.getNomeUsuario().equals(s)){
            bool = false;
        }
    }
        
    
    
    //adiciona usuario à lista. Se nome de usuario ja existe retorna falso
    public boolean cadastrar(Usuario usuario){
        boolean bool = true;
        this.lista.forEach((n) -> auxCadastrar(n, usuario.getNomeUsuario(), bool));
        if (bool){
            this.lista.add(usuario);
        }
        return bool;
    }
    
    //funcao auxiliar do metodo remover
    public void auxRemover(ArrayList a, Usuario u, String nomeU, int temp){       
        if (u.getNomeUsuario().equals(nomeU)){
            temp = a.indexOf(u);
        }
    }
    
    //removendo usuario à lista
    public void remover(String nomeUsuario){
        int temp = -1;
        this.lista.forEach((n) -> auxRemover(this.lista, n, nomeUsuario, temp));
        if (temp != -1)    {
            this.lista.remove(temp);
        }
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

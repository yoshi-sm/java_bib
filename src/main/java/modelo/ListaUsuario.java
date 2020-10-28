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
    public void remover(String nomeUsuario){
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getNomeUsuario().equals(nomeUsuario)){
                this.lista.remove(i);
            }
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

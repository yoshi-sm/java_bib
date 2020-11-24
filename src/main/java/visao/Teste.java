
package visao;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
       
//    Evento e1 = new Evento("Meu aniversário", "Sala 1", "03/02/2021", "Meu aniversário pô");
//    Evento e2 = new Evento("Aniversário dela", "Sala 2", "03/11/2021", "É o aniversário dela");
//    
    ArrayList<Evento> lista = new ArrayList<Evento>();
    
//    lista.add(e1);
//    
//    ListaEvento le1 = new ListaEvento(lista);
//    
//    le1.cadastrar(e2);
//        
//    le1.remover("Meu aniversário");
//    
//    le1.salvarEvento();
    
    ListaEvento bd = new ListaEvento(lista);
    
    bd.carregarEventos();
    
//    ArrayList<Usuario> lista = new ArrayList<Usuario>();
//    
//    ListaUsuario bd = new ListaUsuario(lista);
//    
//    bd.carregarUsuarios();
//    
    System.out.println(bd.toString());
    }
}
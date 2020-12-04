
package visao;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
        
        EspacoEvento quadra = new EspacoEvento("Quadra", "Uniesp");
        EspacoEvento sala1 = new EspacoEvento("Sala 1", "Biblioteca");
        EspacoEvento sala2 = new EspacoEvento("Sala 2", "Biblioteca");
        EspacoEvento lanchonete = new EspacoEvento("Lanchonete", "Praça Uniesp");

        ArrayList<EspacoEvento> lista= new ArrayList<EspacoEvento>();
//        lista.add(quadra);
//        lista.add(sala1);
//        lista.add(sala2);
//        lista.add(lanchonete);

        ListaEspacoEvento bd = new ListaEspacoEvento(lista);
        
        bd.carregarEspacoEventos();
//        bd.cadastrar(sala1);
//        bd.cadastrar(sala2);
//        bd.cadastrar(lanchonete);
//        bd.remover("Quadra");
//        bd.salvarEspacoEvento();

//        if (bd.existe("Sala 1")){
//            System.out.println("Sala 1 existe!");
//        } else {
//            System.out.println("Sala 1 não existe!");
//        }

//        Evento evento1 = new Evento();
//        evento1.setAssunto("Computação");
//        evento1.setData("04-05-2021");
//        evento1.setEspacoEvento(sala1);
//        evento1.setNome("Semana de computação UNIESP");

//        System.out.println(evento1.toString());
    }
}
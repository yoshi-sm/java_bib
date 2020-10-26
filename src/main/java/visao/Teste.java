
package visao;
import modelo.*;
import java.util.ArrayList;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
    //Usuario u1 = new Usuario("yo", "ya", "ye", "yi");
    //System.out.println(u1);
    ArrayList<Livro> b1 = new ArrayList<Livro>();
    ListaLivro lista = new ListaLivro(b1);
    Livro a1 = new Livro("joca");
    Livro a2 = new Livro("Ted");
    Livro a3 = new Livro("Jeb");
    lista.addLivro(a1);
    lista.addLivro(a2);
    lista.addLivro(a3);
    a1 = new Livro("joca");
    a2 = new Livro("Ted");
    a3 = new Livro("Jeb");
    lista.addLivro(a1);
    lista.addLivro(a2);
    lista.addLivro(a3);
    a1 = new Livro("joca");
    a2 = new Livro("Ted");
    a3 = new Livro("Jeb");
    lista.addLivro(a1);
    lista.addLivro(a2);
    lista.addLivro(a3); 
    System.out.println(lista);
    lista.alugar(lista.getLista().get(1), "10-09-2021", "jesse");
    lista.reservar(lista.getLista().get(4), "jason");
    System.out.println(lista);
    //lista.retornarLivro(a1);
    System.out.println(lista);
    ArrayList<Livro> temp = lista.buscaLivro("Ted");
    System.out.println(temp);
}
}
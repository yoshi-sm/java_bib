
package visao;
import modelo.*;
import java.util.ArrayList;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
    Usuario u1 = new Usuario("yo", "yap", "ye", "professor");
    Usuario u2 = new Usuario("joao", "yep", "ye", "estudante");
    Usuario u3 = new Usuario("jesse", "yip", "ye", "estudante");
    Usuario u4 = new Usuario("savio", "yop", "ye", "funcionario");
    Usuario u5 = new Usuario("ernesto", "yup", "ye", "externo");
    Usuario u6 = new Usuario("sabrina", "yas", "ye", "externo");
    Usuario u7 = new Usuario("dororo", "yes", "ye", "professor");
    Usuario u8 = new Usuario("antegue", "yis", "ye", "professor");
    Usuario u9 = new Usuario("marivaldo", "yos", "ye", "professor");
    Usuario u10 = new Usuario("mario", "yip", "ye", "professor");
    ArrayList<Usuario> b1 = new ArrayList<>();
    ListaUsuario lista = new ListaUsuario(b1);
    System.out.println(b1);
    lista.cadastrar(u1);
    System.out.println(b1);
    lista.cadastrar(u3);
    System.out.println(b1);
    lista.cadastrar(u10);
    System.out.println(b1);
    lista.cadastrar(u9);
    System.out.println(b1);
    lista.remover("yap");
    System.out.println(b1);
}
}
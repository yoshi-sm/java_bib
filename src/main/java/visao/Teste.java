
package visao;
import java.util.ArrayList;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

import java.io.File;
import java.io.FileNotFoundException;
import modelo.*;
import java.util.Scanner;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
    ArrayList<Usuario> a1 = new ArrayList<>();
    ListaUsuario b1 = new ListaUsuario(a1);
    b1.carregarUsuarios();
    System.out.print(b1);
    b1.cadastrar(new Usuario("jobson", "moab", "password", 'f'));
    b1.salvarUsuarios();
    }
}
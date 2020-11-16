
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
    
 
    ArrayList<Livro> b1 = new ArrayList<>();
    ListaLivro a1 = new ListaLivro(b1);
    a1.carregarLivros();
    System.out.println(a1);
    a1.addLivro(new Livro("manoel e o chocolate", "Carlos Drummond"));
    a1.salvarLivros();
    }
}
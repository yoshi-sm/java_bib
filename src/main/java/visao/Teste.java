
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
        Livro livro = new Livro("harry potter", "tolkien");
        Livro livro2 = new Livro("harry potter", "tolkien");
        //livro.setId(10);
        ArrayList<Livro> a1 = new ArrayList<>();
        a1.add(livro);
        
        //ListaLivro b1 = new ListaLivro(a1);
        //b1.carregarLivros();
        //System.out.print(livro);
        System.out.print(livro.igual(livro2));
    
    }
}
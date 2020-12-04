
package visao;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author xiuki
 */
public class Teste {
    public static void main(String[] args){
        
        Sala sala1 = new Sala("Sala 1");
        Sala sala2 = new Sala("Sala 2");
        Sala sala3 = new Sala("Sala 3");
        Sala sala4 = new Sala("Sala 4");
        
        ArrayList<Sala> lista = new ArrayList<Sala>();
        
        ListaSala bd = new ListaSala(lista);

//        bd.carregarSalas();
//
//        sala3.setAlugador("pedro");
//        sala3.setAlugado(true);
//        sala3.setData("03-04-2021");
//        sala3.setHorario("Tarde");
//        
//        sala4.setAlugador("fernando");
//        sala4.setAlugado(true);
//        sala4.setData("03-04-2021");
//        sala4.setHorario("Manha");
//        
//        bd.cadastrar(sala1);
//        bd.cadastrar(sala2);
//        bd.cadastrar(sala3);
//        bd.cadastrar(sala4);
//        
//        System.out.println(bd.toString());
//        
        bd.salvarSalas();

    }
}

package Classes;

public class Dados {
    public boolean validarUsuarios(String usuario, String senha){
        if(usuario.equals("fernando") && senha.equals("123")){
            return true;
         
        }else{
            return false;
        }
    }
}

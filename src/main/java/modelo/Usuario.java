
package modelo;
import java.util.ArrayList;


public class Usuario {
    
    private String nome;
    private String nomeUsuario;
    private String senha;
    private String permissao;
    //private ArrayList<Integer> idLivro;
    

    public Usuario(){}

    public Usuario(String n, String n_u, String s, String p){
        this.nome = n;
        this.nomeUsuario = n_u;
        this.senha = s;
        this.permissao = p;
        //this.idLivro = new ArrayList<>();
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nomeUsuario = nome_usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", \nnomeUsuario=" + nomeUsuario + ", \nsenha=" + senha + ", \npermissao=" + permissao + '}';
    }
    

}

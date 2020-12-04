/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author pedro
 */
public class Sala {
    private String nome;
    private boolean alugado;
    private String alugador;
    private String data;
    private String horario;

    public Sala() {
    }
    
    public Sala(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public String getAlugador() {
        return alugador;
    }

    public void setAlugador(String usuario) {
        this.alugador = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Sala{" + "nome=" + nome + ", alugado=" + alugado + ", alugador=" + alugador + ", data=" + data + ", horario=" + horario + '}';
    }

    
}

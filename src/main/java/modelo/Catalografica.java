/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author xiuki
 */
public class Catalografica {
    
    private String titulo;
    private String subtitulo;
    private String autor;
    private String isbn;
    private String assuntos;
    private String edicao;
    private String editora;
    private String local;
    private String paginas;
    private String cdd;
    private String cdu;
    private String nomeUsuario;
    
    public Catalografica(){}
    
    public Catalografica(String titulo, String subtitulo, String autor, 
                         String isbn, String assuntos, String edicao, 
                         String editora, String local, String paginas, 
                         String cdd, String cdu, String nomeUsuario) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.isbn = isbn;
        this.assuntos = assuntos;
        this.edicao = edicao;
        this.editora = editora;
        this.local = local;
        this.paginas = paginas;
        this.cdd = cdd;
        this.cdu = cdu;
        this.nomeUsuario = nomeUsuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(String assuntos) {
        this.assuntos = assuntos;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getCdd() {
        return cdd;
    }

    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    public String getCdu() {
        return cdu;
    }
    
    public void setCdu(String cdu) {
        this.cdu = cdu;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", subtitulo=" + subtitulo + ", autor=" + autor + ", isbn=" + isbn + ", assuntos=" + assuntos + ", edicao=" + edicao + ", editora=" + editora + ", local=" + local + ", paginas=" + paginas + ", cdd=" + cdd + ", cdu=" + cdu + ", nomeUsuario=" + nomeUsuario;
    }
    
    
    
}

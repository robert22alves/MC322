package biblioteca.models.acervo.itensMultimidia;

import java.util.ArrayList;
import biblioteca.models.CSingleton;

public class ItemMultimidiaImpl extends CSingleton implements ItemMultimidia{
    private String titulo;
    private String autor; //Autor, Artista ou Diretor
    private String publicadora; //Editora, Gravadora ou Publicadora
    private String anoPublicacao;
    private String genero;
    private String detalhes;
    private Integer id;

    private ArrayList<Comentario> comentarios;

    public ItemMultimidiaImpl(){
        this.titulo = null;
        this.autor = null;
        this.publicadora = null;
        this.anoPublicacao = null;
        this.genero = null;
        this.detalhes = null;
        this.id = null;
    
        this.comentarios = new ArrayList<>();
    }

    public void newComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    //GETTERS N SETTERS
    @Override
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String getDetalhes() {
        return detalhes;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

}

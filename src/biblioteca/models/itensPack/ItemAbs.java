package biblioteca.models.itensPack;

import java.util.List;
import java.lang.Integer;
import java.util.ArrayList;

public abstract class ItemAbs implements ItemMultimidia{
    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String genero;
    private String detalhes;
    private List<Comentario> comentario;
    private Integer id;

    
    public ItemAbs(String titulo, String autor, String editora, String anoPublicacao, String genero, String detalhes,
            List<Comentario> comentario, Integer id) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.detalhes = detalhes;
        this.comentario = comentario;
        this.id = id;
        this.comentario = new ArrayList<Comentario>();
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public Integer getId() {
        return id;
    }

    public String getEditora() {
        return editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public List<Comentario> getComentario() {
        return comentario;
    }

    @Override
    public String getDetalhes() {
        return detalhes;
    }
    
}

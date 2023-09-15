package biblioteca.models.itensPack;

import java.util.List;
import java.lang.Integer;

public abstract class ItemAbs implements ItemMultimidia{
    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String genero;
    private String detalhes;
    private List<Comentario> comentario;
    private Integer id;

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

package biblioteca.models.itensPack;

public abstract class ItemAbs implements ItemMultimidia{
    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String genero;
    private String detalhes;

    @Override
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
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

    @Override
    public String getDetalhes() {
        return detalhes;
    }
    
}

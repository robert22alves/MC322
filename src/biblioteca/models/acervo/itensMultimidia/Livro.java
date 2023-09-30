package biblioteca.models.acervo.itensMultimidia;

public class Livro extends ItemMultimidiaImpl{
    private String isbn;
    private String edicao;
    private String localização; //estante e prateleira

    public Livro() {
        super();

        this.isbn = null;
        this.edicao = null;
        this.localização = null;
    }

    //GETTERS N SETTERS
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }
    
}

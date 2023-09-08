package biblioteca.models.itensPack;

public class Book extends ItemAbs{
    private String isbn;
    private String edicao;
    private int numeroCopias;
    private int copiasDisponiveis;
    private String Localização; //estante e prateleira
    private String estadoConservacao;


    public String getIsbn() {
        return isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public String getLocalização() {
        return Localização;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }
}

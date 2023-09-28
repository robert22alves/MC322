package biblioteca.models.itensPack;

import java.util.List;

public class Book extends ItemAbs{
    private String isbn;
    private String edicao;
    private int numeroCopias;
    private int copiasDisponiveis;
    private String Localização; //estante e prateleira
    private String estadoConservacao;

    public Book(String isbn, String edicao, int numeroCopias, int copiasDisponiveis, String localização, String estadoConservacao, String titulo, String autor, String editora, String anoPublicacao, String genero, String detalhes,
            List<Comentario> comentario, Integer id) {
        super(titulo, autor, editora, anoPublicacao, genero, detalhes, comentario, id);
        this.isbn = isbn;
        this.edicao = edicao;
        this.numeroCopias = numeroCopias;
        this.copiasDisponiveis = copiasDisponiveis;
        Localização = localização;
        this.estadoConservacao = estadoConservacao;
    }

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

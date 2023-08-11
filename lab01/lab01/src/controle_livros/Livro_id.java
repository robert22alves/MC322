package controle_livros;

public class Livro_id {
    //Identificacao
    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String isbn;

    public Livro_id(String titulo, String autor, String editora, String edicao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }
}

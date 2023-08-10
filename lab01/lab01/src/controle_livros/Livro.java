package controle_livros;

public class Livro {
    //Identificacao
    private String titulo;
    private String autor;
    private String editora;
    private String edicao;
    private String isbn;

    //Controle de Quantidade
    private int qtd_total;
    private int qtd_disponivel;
    private Emp_livros[] emprestimos;

    public Livro(String titulo, String autor, String editora, String edicao, String isbn, int qtd){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;

        this.qtd_total = this.qtd_disponivel = qtd;
        this.emprestimos = new Emp_livros[qtd_total];
    }

    public void detalhes() {
        System.out.println("Livro: " + titulo + "\nAutor: " + autor + "\nEdicao" + edicao + "\nEditora: " + editora);
    }

    public void emprestimos() {

    }

    public String getIsbn() {
        return isbn;
    }

    public int getQtd_total() {
        return qtd_total;
    }

    public int getQtd_disponivel() {
        return qtd_disponivel;
    }

    

}

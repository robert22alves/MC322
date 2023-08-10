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
        if (qtd_total - qtd_disponivel == 0){
            System.out.println("Nao ha emprestimos desse livro");
            return;
        }

        System.out.println("Emprestimo(s):");
        for (int i = 0; i < qtd_total - qtd_disponivel; i++){
            System.out.println(emprestimos[i].funcao + " " + emprestimos[i].membro + " (" + emprestimos[i].registro + ") | " + emprestimos[i].data_emprestimo + " | " + emprestimos[i].data_devolucao);
        }
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

    public int getQtd_total() {
        return qtd_total;
    }

    public int getQtd_disponivel() {
        return qtd_disponivel;
    }
}

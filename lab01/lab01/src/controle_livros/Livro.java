package controle_livros;

public class Livro {
    private Livro_id info;
    private Livro_emp controle;

    public Livro(String titulo, String autor, String editora, String edicao, String isbn, int unidades){
        this.info = new Livro_id(titulo, autor, editora, edicao, isbn);
        this.controle = new Livro_emp(unidades);
    }

    public void imprimirInfo(){
        System.out.println("Titulo: " + info.getTitulo());
        System.out.println("Autor: " + info.getAutor());
        System.out.println("Edicao: " + info.getEdicao());
        System.out.println("Editora: " + info.getEditora());
    }

    public void imprimirEmps(){
        for(int i = 0; i < controle.total - controle.disponiveis; i++)
            System.out.println(controle.emprestimos[i] + " devolver " + controle.devolucoes[i]);
    }

    public boolean add_Emprestimo(String membro, String devolucao) {
        if(controle.disponiveis == 0){
            System.out.println("Nao ha unidades disponiveis");
            return false;
        }

        controle.add(membro, devolucao);
        return true;
    }

    public void del_Emprestimo(String membro) {
        controle.remover(membro);
    }

    public Livro_id getInfo() {
        return info;
    }

    public Livro_emp getControle() {
        return controle;
    }
}

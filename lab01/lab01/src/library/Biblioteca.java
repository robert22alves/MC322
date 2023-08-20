package library;

import controle_livros.Livro;

public class Biblioteca {
    private Livro[] livros;
    private int quantidade_Livros;

    public Biblioteca(int quantidade_total) {
        this.livros = new Livro[quantidade_total];
        this.quantidade_Livros = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (quantidade_Livros < livros.length){
            livros[quantidade_Livros++] = livro;
            System.out.println("Livro " + livro.getInfo().getTitulo() + " adicionado na biblioteca");
        }
        else {
            System.out.println("Biblioteca Cheia");
        }
    }

    public void imprimirLivros(){
        System.out.println("Livros da Biblioteca:");
        for (int i = 0; i < livros.length; i++){
            livros[i].imprimirInfo();
            System.out.print('\n');
        }
    }

    public Livro[] getLivros() {
        return livros;
    }

    public int getQuantidade_Livros() {
        return quantidade_Livros;
    }    
}

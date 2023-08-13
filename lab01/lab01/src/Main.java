import controle_livros.Livro;
import controle_membros.Membro;

public class Main {
    public static void main(String[] args) {
        //criando a biblioteca
        Biblioteca biblioteca = new Biblioteca(2);
        Livro livro1 = new Livro("A Sociedade do Anel", "J.R.R. Tolkien", "HarperCollins", "1", "6555113634", 4);
        Livro livro2 = new Livro("A Guerra dos Tronos", "George R. R. Martin", "Suma", "1", "8556510787", 2);
        Livro livro3 = new Livro("The Witcher", "Sapkowski", "WMF", "1", "6586016517", 5);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        System.out.print('\n');
        biblioteca.imprimirLivros();

        //criando a lista de membros
        Membros membros = new Membros(4);
        Membro membro1 = new Membro("Joao", "000001");
        Membro membro2 = new Membro("Ana", "000002");
        Membro membro3 = new Membro("Jose", "000003");
        Membro membro4 = new Membro("Maria", "000004");
        Membro membro5 = new Membro("Luis", "000005");
        
        membros.adicionarMembro(membro1);
        membros.adicionarMembro(membro2);
        membros.adicionarMembro(membro3);
        membros.adicionarMembro(membro4);
        membros.adicionarMembro(membro5);
        System.out.print('\n');
        membros.imprimirMembros();
        
    }
}

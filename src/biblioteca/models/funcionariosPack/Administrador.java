package biblioteca.models.funcionariosPack;

public class Administrador extends Gerente{
    public Administrador(String nome, String identificacao, String endereco, String contato, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, limiteEmprestimo, prazoEmprestimo);
    }
}

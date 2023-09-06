package biblioteca.models.funcionariosPack;

public class Gerente extends Atendente{
    public Gerente(String nome, String identificacao, String endereco, String contato, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, limiteEmprestimo, prazoEmprestimo);
    }
}

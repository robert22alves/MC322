package biblioteca.models.membrosPack;

public class Funcionario extends MembroAbs{
    public Funcionario(String nome, String identificacao, String endereco, String contato, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, limiteEmprestimo, prazoEmprestimo);
    }
}

package biblioteca.models.funcionariosPack;
import biblioteca.models.membrosPack.Funcionario;

public class Atendente extends Funcionario{
    public Atendente(String nome, String identificacao, String endereco, String contato, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, limiteEmprestimo, prazoEmprestimo);
    }
}

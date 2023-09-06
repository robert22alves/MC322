package biblioteca.models.funcionariosPack;
import biblioteca.models.Data;
import biblioteca.models.membrosPack.Funcionario;

public class Atendente extends Funcionario{
    public Atendente(String nome, String identificacao, String endereco, String contato, Data dataRegistro, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, dataRegistro, limiteEmprestimo, prazoEmprestimo);
    }
}

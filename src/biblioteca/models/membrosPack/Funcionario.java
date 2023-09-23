package biblioteca.models.membrosPack;
import biblioteca.models.Data;
import biblioteca.models.servicosPack.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends MembroAbs{
    public Funcionario(String nome, String identificacao, String endereco, String contato, Data dataRegistro, List<Emprestimo> historico) {
        super(nome, identificacao, endereco, contato, dataRegistro, 4, 20, 0.75, new ArrayList<Emprestimo>());
    }
}

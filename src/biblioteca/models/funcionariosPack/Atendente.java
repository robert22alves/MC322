package biblioteca.models.funcionariosPack;
import java.util.ArrayList;

import biblioteca.models.Data;
import biblioteca.models.membrosPack.Funcionario;
import biblioteca.models.servicosPack.Emprestimo;

public class Atendente extends Funcionario{
    public Atendente(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, new ArrayList<Emprestimo>());
    }
}

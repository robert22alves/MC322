package biblioteca.models.membrosPack;
import biblioteca.models.Data;
import biblioteca.models.servicosPack.Emprestimo;
import java.util.ArrayList;

public class PosGraduando extends MembroAbs{
    public PosGraduando(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 5, 20, 1, new ArrayList());
    }
}

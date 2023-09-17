package biblioteca.models.membrosPack;
import biblioteca.models.Data;
import biblioteca.models.servicosPack.Emprestimo;
import java.util.ArrayList;

public class Graduando extends MembroAbs{
    public Graduando(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 3, 15, 1,new ArrayList());
    }
}

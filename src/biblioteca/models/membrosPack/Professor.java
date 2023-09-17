package biblioteca.models.membrosPack;

import biblioteca.models.Data;
import biblioteca.models.servicosPack.Emprestimo;
import java.util.ArrayList;

public class Professor extends MembroAbs{
    public Professor(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 7, 30, 0.75, new ArrayList());
    }
}

package biblioteca.models.membrosPack;
import biblioteca.models.Data;

public class PosGraduando extends MembroAbs{
    public PosGraduando(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 5, 20, 1);
    }
}

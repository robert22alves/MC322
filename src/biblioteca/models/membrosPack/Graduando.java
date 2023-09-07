package biblioteca.models.membrosPack;
import biblioteca.models.Data;

public class Graduando extends MembroAbs{
    public Graduando(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 3, 15, 1);
    }
}

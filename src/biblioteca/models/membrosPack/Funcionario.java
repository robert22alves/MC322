package biblioteca.models.membrosPack;
import biblioteca.models.Data;

public class Funcionario extends MembroAbs{
    public Funcionario(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 4, 20, 0.75);
    }
}

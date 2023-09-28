package biblioteca.models.funcionariosPack;
import biblioteca.models.Data;

public class Gerente extends Atendente{
    public Gerente(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro);
    }
}

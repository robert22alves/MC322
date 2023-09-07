package biblioteca.models.funcionariosPack;
import biblioteca.models.Data;

public class Administrador extends Gerente{
    public Administrador(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro);
    }
}

package biblioteca.models.funcionarios;

public class Administrador extends Gerente{
    private final static int nivelAcesso = 2;

    public Administrador() {
        super();
    }

    public int getNivelacesso() {
        return nivelAcesso;
    }

}

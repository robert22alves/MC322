package biblioteca.models.funcionarios;

public class Gerente extends Atendente{
    private final static int nivelAcesso = 1;

    public Gerente() {
        super();
    }

    public int getNivelacesso() {
        return nivelAcesso;
    }

}

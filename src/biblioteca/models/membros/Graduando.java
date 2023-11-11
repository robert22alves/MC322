package biblioteca.models.membros;

public class Graduando extends MembroImpl{

    private static int limiteEmprestimo = 3;
    private static int prazoEmprestimo = 15;
    private static double multaAtraso = 1.00;

    public Graduando() {
        super();
    }

    @Override
    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public static void setLimiteEmprestimo(int limiteEmprestimo) {
        Graduando.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static void setPrazoEmprestimo(int prazoEmprestimo) {
        Graduando.prazoEmprestimo = prazoEmprestimo;
    }

    @Override
    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
        Graduando.multaAtraso = multaAtraso;
    }

}

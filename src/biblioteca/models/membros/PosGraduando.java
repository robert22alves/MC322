package biblioteca.models.membros;

import biblioteca.models.Data;

public class PosGraduando extends MembroImpl{
    private static int limiteEmprestimo = 5;
    private static int prazoEmprestimo = 20;
    private static double multaAtraso = 1.00;

    public PosGraduando() {
        super();
    }

    //GETTERS N SETTERS
    @Override
    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public static void setLimiteEmprestimo(int limiteEmprestimo) {
        PosGraduando.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static void setPrazoEmprestimo(int prazoEmprestimo) {
        PosGraduando.prazoEmprestimo = prazoEmprestimo;
    }

    @Override
    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
        PosGraduando.multaAtraso = multaAtraso;
    }
}


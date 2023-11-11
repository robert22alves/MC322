package biblioteca.models.membros;

import biblioteca.models.Data;

public class Professor extends MembroImpl{
    private static int limiteEmprestimo = 7;
    private static int prazoEmprestimo = 30;
    private static double multaAtraso = 0.50;

    public Professor() {
        super();
    }

    //GETTERS N SETTERS
    @Override
    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public static void setLimiteEmprestimo(int limiteEmprestimo) {
        Professor.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static void setPrazoEmprestimo(int prazoEmprestimo) {
        Professor.prazoEmprestimo = prazoEmprestimo;
    }

    @Override
    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
        Professor.multaAtraso = multaAtraso;
    }
}

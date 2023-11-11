package biblioteca.models.membros;

import biblioteca.models.Data;

public class Funcionario extends MembroImpl{
    private static int limiteEmprestimo = 4;
    private static int prazoEmprestimo = 20;
    private static double multaAtraso = 0.75;

    public Funcionario() {
        super();
    }

    //GETTERS N SETTERS
    @Override
    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public static void setLimiteEmprestimo(int limiteEmprestimo) {
        Funcionario.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public static void setPrazoEmprestimo(int prazoEmprestimo) {
        Funcionario.prazoEmprestimo = prazoEmprestimo;
    }

    @Override
    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
        Funcionario.multaAtraso = multaAtraso;
    }
}


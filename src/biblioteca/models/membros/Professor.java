package biblioteca.models.membros;

import biblioteca.models.Data;

public class Professor implements Membro{
    private String nome;
    private String identificacao;
    private String endereco;
    private String contato;
    private Data dataRegistro;

    private static int limiteEmprestimo = 7;
    private static int prazoEmprestimo = 30;
    private static double multaAtraso = 0.50;

    public Professor() {
        this.nome = null;
        this.identificacao = null;
        this.endereco = null;
        this.contato = null;
        this.dataRegistro = null;
    }

    //GETTERS N SETTERS
    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Data getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Data dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

}

package biblioteca.models.membrosPack;
import biblioteca.models.Data;

public abstract class MembroAbs implements Membro{
    private String nome;
    private String identificacao;
    private String endereco;
    private String contato;
    private Data dataRegistro;

    private int limiteEmprestimo;
    private int prazoEmprestimo;
    private double multaAtraso;

    public MembroAbs(String nome, String identificacao, String endereco, String contato, Data dataRegistro, int limiteEmprestimo, int prazoEmprestimo) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;

        this.limiteEmprestimo = limiteEmprestimo;
        this.prazoEmprestimo = prazoEmprestimo;
        this.multaAtraso = 0;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getIdentificacao() {
        return identificacao;    
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public Data getDataRegistro() {
        return dataRegistro;
    }

    @Override
    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    @Override
    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    @Override
    public double getMultaAtraso() {
        return multaAtraso;    
    }
    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        return identificacao.hashCode();
    }
}

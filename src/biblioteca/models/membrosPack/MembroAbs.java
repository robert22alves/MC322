package biblioteca.models.membrosPack;
import biblioteca.models.Data;
import biblioteca.models.servicosPack.Emprestimo;
import java.util.ArrayList;

public abstract class MembroAbs implements Membro{
    private String nome;
    private String identificacao;
    private String endereco;
    private String contato;
    private Data dataRegistro;
    private ArrayList<Emprestimo> historico;


    private int limiteEmprestimo;
    private int prazoEmprestimo;
    private double multaAtraso;

    public MembroAbs(String nome, String identificacao, String endereco, String contato, Data dataRegistro, int limiteEmprestimo, int prazoEmprestimo, double multaAtraso, ArrayList<Emprestimo> historico) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.endereco = endereco;
        this.contato = contato;
        this.dataRegistro = dataRegistro;

        this.historico = new ArrayList();
        this.limiteEmprestimo = limiteEmprestimo;
        this.prazoEmprestimo = prazoEmprestimo;
        this.multaAtraso = multaAtraso;
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

    public ArrayList<Emprestimo> getHistorico() {
        return historico;
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

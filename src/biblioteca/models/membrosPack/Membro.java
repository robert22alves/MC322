package biblioteca.models.membrosPack;

public interface Membro {
    String getNome();
    String getIdentificacao();
    int getLimiteEmprestimo();
    int getPrazoEmprestimo();
    double getMultaAtraso();
}
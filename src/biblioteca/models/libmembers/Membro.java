package biblioteca.models.libmembers;

public interface Membro {
    String getNome();
    String getIdentificacao();
    int getLimiteEmprestimo();
    int getPrazoEmprestimo();
    double getMultaAtraso();
}
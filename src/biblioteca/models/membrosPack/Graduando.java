package biblioteca.models.membrosPack;
import biblioteca.models.Data;

public class Graduando extends MembroAbs{
    public Graduando(String nome, String identificacao, String endereco, String contato, Data dataRegistro, int limiteEmprestimo, int prazoEmprestimo) {
        super(nome, identificacao, endereco, contato, dataRegistro, limiteEmprestimo, prazoEmprestimo);
    }
}

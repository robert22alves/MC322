package controle_livros;

public class Livro_emp {
    protected int total;
    protected int disponiveis;
    protected String emprestimos[]; //membro
    protected String devolucoes[]; //data de devolucao

    public Livro_emp(int unidades){
        this.total = this.disponiveis = unidades;
        this.emprestimos = new String[unidades];
        this.devolucoes = new String[unidades];
    }

    protected void add(String membro, String devolucao){
        this.emprestimos[total - disponiveis] = membro;
        this.devolucoes[total - disponiveis] = devolucao;
        this.disponiveis--;
    }

    protected void remover(String membro){
        for (int i = 0, j = total - disponiveis; i < j; i++)
            if(emprestimos[i] == membro){
                for (j--; i < j; i++)
                    emprestimos[i] = emprestimos[i + 1];
                this.disponiveis++;
                return;
            }
    }

    public int getTotal() {
        return total;
    }

    public int getDisponiveis() {
        return disponiveis;
    }
}

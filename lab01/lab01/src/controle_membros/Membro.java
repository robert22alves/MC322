package controle_membros;
import controle_livros.Livro_id;

public class Membro {
    private Membro_id info;
    private int total; //total de emprestimos possiveis
    private int emprestimos; //emprestimos feitos 
    private Livro_id[] livros;
    private String[][] periodos; //data de emprestimo e devolucao

    public Membro(String nome, String registro){
        this.info = new Membro_id(nome, registro);
        this.total = 5;
        this.emprestimos = 0;
        this.livros = new Livro_id[total];
        this.periodos = new String[total][2];
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + info.getNome());
        System.out.println("Identificacao: " + info.getRegistro());
        System.out.print("Atividade: " + info.getAtividade());
        if (info.getAtividade() == "Emprestimo")
            System.out.print(" " + emprestimos + '\n');
        else
            System.out.print('\n');
    }

    public void imprimirEmps(){
        for(int i = 0; i < emprestimos; i++)
            System.out.println(livros[i].getTitulo() + " | emprestada" + periodos[i][0] + ", devolver " + periodos[i][1]);
    }

    public void adicionar(Livro_id livro, String dt_emp, String dt_dev){
        this.livros[emprestimos] = livro;
        this.periodos[emprestimos][0] = dt_emp;
        this.periodos[emprestimos][1] = dt_dev;
        this.emprestimos++;
    }

    public void remover(Livro_id livro){
        for (int i = 0, j = emprestimos; i < j; i++)
            if(livros[i] == livro){
                for (j--; i < j; i++){
                    livros[i] = livros[i + 1];
                    periodos[i] = periodos[i + 1];
                }
                this.emprestimos++;
                return;
            }
    }

    public Membro_id getInfo() {
        return info;
    }

    public int getTotal() {
        return total;
    }

    public int getEmprestimos() {
        return emprestimos;
    }
}

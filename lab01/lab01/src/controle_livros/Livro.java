package controle_livros;
import controle_membros.Membro_id;

public class Livro {
    private Livro_id info;
    private int total; //total de unidades
    private int disponiveis; //unidades disponiveis 
    private Membro_id[] membros; 
    private String[][] periodos; //data de emprestimo e devolucao

    public Livro(String titulo, String autor, String editora, String edicao, String isbn, int unidades){
        this.info = new Livro_id(titulo, autor, editora, edicao, isbn);
        this.total = this.disponiveis = unidades;
        this.membros = new Membro_id[unidades];
        this.periodos = new String[unidades][2];
    }

    public void imprimirInfo(){
        System.out.println("Titulo: " + info.getTitulo());
        System.out.println("Autor: " + info.getAutor());
        System.out.println("Edicao: " + info.getEdicao());
        System.out.println("Editora: " + info.getEditora());
        System.out.println("Quantidade: " + disponiveis + " disponiveis");
    }

    public void imprimirEmps(){
        System.out.println("Emprestimo do livro " +info.getTitulo());
        for(int i = 0; i < total - disponiveis; i++)
            System.out.println(membros[i].getNome() + " | emprestado " + periodos[i][0] + ", devolver " + periodos[i][1]);
    }

    public void adicionar(Membro_id membro_id, String dt_emp, String dt_dev){
        this.membros[total - disponiveis] = membro_id;
        this.periodos[total - disponiveis][0] = dt_emp;
        this.periodos[total - disponiveis][1] = dt_dev;
        this.disponiveis--;
    }

    public void remover(Membro_id membro_id){
        for (int i = 0, j = total - disponiveis; i < j; i++)
            if(membros[i] == membro_id){
                for (j--; i < j; i++){
                    membros[i] = membros[i + 1];
                    periodos[i] = periodos[i + 1];
                }
                this.disponiveis++;
                return;
            }
    }

    public Livro_id getInfo() {
        return info;
    }

    public int getTotal() {
        return total;
    }

    public int getDisponiveis() {
        return disponiveis;
    }
}

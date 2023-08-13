package controle_livros;

public class Livro {
    private Livro_id info;
    private int total; //total de unidades
    private int disponiveis; //unidades disponiveis 
    private String[] membros; 
    private String[][] periodos; //data de emprestimo e devolucao

    public Livro(String titulo, String autor, String editora, String edicao, String isbn, int unidades){
        this.info = new Livro_id(titulo, autor, editora, edicao, isbn);
        this.total = this.disponiveis = unidades;
        this.membros = new String[unidades];
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
        for(int i = 0; i < total - disponiveis; i++)
            System.out.println(membros[i] + " | emprestada" + periodos[i][0] + ", devolver " + periodos[i][1]);
    }

    public void adicionar(String membro, String dt_emp, String dt_dev){
        this.membros[total - disponiveis] = membro;
        this.periodos[total - disponiveis][0] = dt_emp;
        this.periodos[total - disponiveis][1] = dt_dev;
        this.disponiveis--;
    }

    public void remover(String membro){
        for (int i = 0, j = total - disponiveis; i < j; i++)
            if(membros[i] == membro){
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

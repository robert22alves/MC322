package controle_membros;

public class Membro_id {
    private String nome;
    private String registro; 
    private String atividade; //Nenhuma, Emprestimo ou Suspensão

    public Membro_id(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
        this.atividade = "Nenhuma";
    }

    public String getNome() {
        return nome;
    }

    public String getRegistro() {
        return registro;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    } 
}

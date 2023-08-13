public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;

    public Funcionario(String nome, String cpf, String funcao){
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getFuncao() {
        return funcao;
    }
}

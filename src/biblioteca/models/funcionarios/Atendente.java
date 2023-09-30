package biblioteca.models.funcionarios;

import biblioteca.models.membros.Funcionario;

public class Atendente extends Funcionario{
    private final static int nivelAcesso = 0;
    private String senha;

    public Atendente() {
        super();

        this.senha = null;
    }

    public int getNivelacesso() {
        return nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

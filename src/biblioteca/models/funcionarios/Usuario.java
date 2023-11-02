package biblioteca.models.funcionarios;

public class Usuario {
    private final int nivelAcesso;
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha, int nivelAcesso) {
        this.usuario = usuario;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
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

    public String getUsuario() {
        return usuario;
    }
    
}

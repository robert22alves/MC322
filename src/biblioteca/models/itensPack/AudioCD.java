package biblioteca.models.itensPack;

import java.util.List;

public class AudioCD extends ItemAbs{
    private String listaFaixas;
    private String duracaoTotal;
    private int numeroCopias;
    private int numeroDisponíveis;
    private String estadoConservacao;

    public AudioCD(String listaFaixas, String duracaoTotal, int numeroCopias, int numeroDisponíveis, String estadoConservacao, String titulo, String autor, String editora, String anoPublicacao, String genero, String detalhes,
            List<Comentario> comentario, Integer id) {
        super(titulo, autor, editora, anoPublicacao, genero, detalhes, comentario, id);
        this.listaFaixas = listaFaixas;
        this.duracaoTotal = duracaoTotal;
        this.numeroCopias = numeroCopias;
        this.numeroDisponíveis = numeroDisponíveis;
        this.estadoConservacao = estadoConservacao;
    }
    public String getListaFaixas() {
        return listaFaixas;

    }
    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public int getNumeroDisponíveis() {
        return numeroDisponíveis;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }
}

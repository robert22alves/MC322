package biblioteca.models.itensPack;

import java.util.List;

public class VideoDVD extends ItemAbs{
    private String[] elenco;
    private String duracao;
    private int numeroCopias;
    private int numeroDisponíveis;
    private int numeroLegendas;
    private int numeroAudios;
    private String estadoConservacao;


    public VideoDVD(String[] elenco, String duracao, int numeroCopias, int numeroDisponíveis, int numeroLegendas, int numeroAudios, String estadoConservacao, String titulo, String autor, String editora, String anoPublicacao, String genero, String detalhes,
            List<Comentario> comentario, Integer id) {
        super(titulo, autor, editora, anoPublicacao, genero, detalhes, comentario, id);
        this.elenco = elenco;
        this.duracao = duracao;
        this.numeroCopias = numeroCopias;
        this.numeroDisponíveis = numeroDisponíveis;
        this.numeroLegendas = numeroLegendas;
        this.numeroAudios = numeroAudios;
        this.estadoConservacao = estadoConservacao;
    }

    public String[] getElenco() {
        return elenco;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public int getNumeroDisponíveis() {
        return numeroDisponíveis;
    }

    public int getNumeroLegendas() {
        return numeroLegendas;
    }

    public int getNumeroAudios() {
        return numeroAudios;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }
}

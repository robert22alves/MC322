package biblioteca.models.itensPack;

public class VideoDVD extends ItemAbs{
    private String[] elenco;
    private String duracao;
    private int numeroCopias;
    private int numeroDisponíveis;
    private int numeroLegendas;
    private int numeroAudios;
    private String estadoConservacao;



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

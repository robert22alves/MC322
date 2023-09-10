package biblioteca.models.itensPack;

public class AudioCD extends ItemAbs{
    private String listaFaixas;
    private String duracaoTotal;
    private int numeroCopias;
    private int numeroDisponíveis;
    private String estadoConservacao;



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

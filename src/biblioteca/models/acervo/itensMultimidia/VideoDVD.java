package biblioteca.models.acervo.itensMultimidia;

public class VideoDVD extends ItemMultimidiaImpl{
    private String[] elenco;
    private String duracao;
    private int numeroLegendas;
    private int numeroAudios;

    public VideoDVD() {
        super();

        this.elenco = null;
        this.duracao = null;
        this.numeroLegendas = 0;
        this.numeroAudios = 0;
    }

    //GETTERS N SETTERS
    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getNumeroLegendas() {
        return numeroLegendas;
    }

    public void setNumeroLegendas(int numeroLegendas) {
        this.numeroLegendas = numeroLegendas;
    }

    public int getNumeroAudios() {
        return numeroAudios;
    }

    public void setNumeroAudios(int numeroAudios) {
        this.numeroAudios = numeroAudios;
    }
    
}

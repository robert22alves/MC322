package biblioteca.models.acervo.itensMultimidia;

public class AudioCD extends ItemMultimidiaImpl{
    private String listaFaixas;
    private String duracaoTotal;

    public AudioCD() {
        super();

        this.listaFaixas = null;
        this.duracaoTotal = null;
    }

    //GETTERS N SETTERS
    public String getListaFaixas() {
        return listaFaixas;
    }

    public void setListaFaixas(String listaFaixas) {
        this.listaFaixas = listaFaixas;
    }

    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(String duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    @Override
    public IItemMultimediaFactory criarItemMultimedia() {
        return new AudioCD();
    }
    
}

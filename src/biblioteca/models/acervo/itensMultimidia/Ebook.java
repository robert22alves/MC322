package biblioteca.models.acervo.itensMultimidia;

import biblioteca.models.Data;

public class Ebook extends ItemMultimidiaImpl{
    private String formato; //PDF, ePub, etc
    private String url;
    private String requisitosLeitura; //software, dispositivo compatível
    private Data dataDisponibilidade;

    public Ebook() {
        super();

        this.formato = null;
        this.url = null;
        this.requisitosLeitura = null;
        this.dataDisponibilidade = null;
    }

    //GETTERS N SETTERS
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequisitosLeitura() {
        return requisitosLeitura;
    }

    public void setRequisitosLeitura(String requisitosLeitura) {
        this.requisitosLeitura = requisitosLeitura;
    }

    public Data getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(Data dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }

}

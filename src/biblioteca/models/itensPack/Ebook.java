package biblioteca.models.itensPack;
import biblioteca.models.Data;

public class Ebook extends ItemAbs{
    private String formato; //PDF, ePub, etc
    private int numeroLicencas; //cópias simultâneas permitidas)
    private String url;
    private String requisitosLeitura; //software, dispositivo compatível
    private Data dataDisponibilidade;
    


    public String getFormato() {
        return formato;
    }

    public int getNumeroLicencas() {
        return numeroLicencas;
    }

    public String getUrl() {
        return url;
    }

    public String getRequisitosLeitura() {
        return requisitosLeitura;
    }

    public Data getDataDisponibilidade() {
        return dataDisponibilidade;
    }
}

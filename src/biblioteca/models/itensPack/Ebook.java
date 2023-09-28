package biblioteca.models.itensPack;
import java.util.List;

import biblioteca.models.Data;

public class Ebook extends ItemAbs{
    private String formato; //PDF, ePub, etc
    private int numeroLicencas; //cópias simultâneas permitidas)
    private String url;
    private String requisitosLeitura; //software, dispositivo compatível
    private Data dataDisponibilidade;
    
    public Ebook(String formato, int numeroLicencas, String url, String requisitosLeitura, Data dataDisponibilidade, String titulo, String autor, String editora, String anoPublicacao, String genero, String detalhes,
            List<Comentario> comentario, Integer id) {
        super(titulo, autor, editora, anoPublicacao, genero, detalhes, comentario, id);
        this.formato = formato;
        this.numeroLicencas = numeroLicencas;
        this.url = url;
        this.requisitosLeitura = requisitosLeitura;
        this.dataDisponibilidade = dataDisponibilidade;
    }

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

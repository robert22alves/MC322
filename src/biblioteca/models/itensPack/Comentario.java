package biblioteca.models.itensPack;

import java.lang.Integer;

public class Comentario{
    private Integer membroId;
    private String texto;
    private Integer itemId;

    public Comentario(java.lang.Integer membroId, String texto, java.lang.Integer itemId) {
        this.membroId = membroId;
        this.texto = texto;
        this.itemId = itemId;
    }
    //GETTERS
    public Integer getMembroId() {
        return membroId;
    }
    public String getTexto() {
        return texto;
    }
    public Integer getItemId() {
        return itemId;
    }

}
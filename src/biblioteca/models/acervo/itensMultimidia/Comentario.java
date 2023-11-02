package biblioteca.models.acervo.itensMultimidia;

import biblioteca.models.membros.Membro;

public class Comentario {
    private Integer itemId; 
    private String membroId; 
    private String texto;

    public Comentario(ItemMultimidia item, Membro membro) {
        this.itemId = item.getId();
        this.membroId = membro.getIdentificacao();
        this.texto = null;
    }

    //GETTERS N SETTERS
    public Integer getItemId() {
        return itemId;
    }

    public String getMembroId() {
        return membroId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

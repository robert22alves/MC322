package biblioteca.models.acervo.recursosMultimidia;

import biblioteca.models.acervo.Acervo;

public class Multimidia  implements Acervo{
    private Integer id;

    enum FormatoMultimidia{
        AUDIO, VIDEO, SOFTWARE
    }

    private FormatoMultimidia formato;

    public Multimidia(FormatoMultimidia formato) {
        this.formato = formato;
    }

    public FormatoMultimidia getFormato() {
        return formato;
    }

    @Override
    public Integer getId() {
        return id;
    }
}

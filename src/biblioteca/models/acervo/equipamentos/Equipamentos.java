package biblioteca.models.acervo.equipamentos;

import biblioteca.models.acervo.Acervo;

public class Equipamentos implements Acervo{
    private Integer id;

    enum CategoriaEquipamento {
        INFORMATICA, AUDIOVISUAL, IMPRESSAO
    }

    private CategoriaEquipamento categoria;

    public Equipamentos(CategoriaEquipamento categoria) {
        this.categoria = categoria;
    }
    
    public CategoriaEquipamento getCategoria() {
        return categoria;
    }

    @Override
    public Integer getId() {
        return id;
    }

}

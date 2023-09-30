package biblioteca.models.acervo.salas;

import java.util.ArrayList;

public class SalaMultimidia extends Sala{
    private ArrayList<String> equipamentos;

    public SalaMultimidia() {
        super();

        this.equipamentos = new ArrayList<>();
    }

    public void newEquipamento(String equipamneto) {
        equipamentos.add(equipamneto);
    }

    public ArrayList<String> getEquipamentos() {
        return equipamentos;
    }
}

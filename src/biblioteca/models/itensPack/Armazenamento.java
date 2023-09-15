package biblioteca.models.itensPack;

import biblioteca.models.itensPack.ItemAbs;
import java.util.Map;

public class Armazenamento{

    Map<Integer, ItemAbs> armazenamento;

    public Armazenamento(Map<Integer, ItemAbs> armazenamento) {
        this.armazenamento = armazenamento;
    }


    //Getter
    public Map<Integer, ItemAbs> getArmazenamento() {
        return armazenamento;
    }

    //Setter
    public void setArmazenamento(Map<Integer, ItemAbs> armazenamento) {
        this.armazenamento = armazenamento;
    }

 }
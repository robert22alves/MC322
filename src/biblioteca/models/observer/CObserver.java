package biblioteca.models.observer;

import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;

public class CObserver {
    
    public void notificar(ItemMultimidia item) {
        System.out.println(item + " esta disponivel.");
    }
}

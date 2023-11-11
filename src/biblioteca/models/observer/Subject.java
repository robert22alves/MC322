package biblioteca.models.observer;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;

public class Subject {
    private ArrayList<CObserver> observadores;
    
    public Subject() {
        this.observadores = new ArrayList<>();
    }

    public void registrarObservador(CObserver observador) {
        observadores.add(observador);
    }

    public void notificar(ItemMultimidia item) {
        for (CObserver o : observadores) {
            o.notificar(item);
        }
    }
}

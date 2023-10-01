package biblioteca.models.acervo;

import java.util.ArrayList;

public class ItemBiblioteca<T extends Acervo> implements Acervo{
    private final T item;
    private int exemplares; //Exemplares ou Licencas
    private int exDisponiveis;
    private int exReservadas;
    private int exEmprestadas;
    private ArrayList<StatusExemplar> statusExemplares;

    public ItemBiblioteca(T item) {
        this.item = item;
        this.exemplares = 0;
        this.exDisponiveis = 0;
        this.exEmprestadas = 0;
        this.exReservadas = 0;
        this.statusExemplares = new ArrayList<>();
    }

    //GETTERS N SETTERS
    public T getItem() {
        return item;
    }

    public ArrayList<StatusExemplar> getStatusExemplares() {
        return statusExemplares;
    }

    public StatusExemplar getStatusExemplar(int exemplar) {
        return statusExemplares.get(exemplar);
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public int getExDisponíveis() {
        return exDisponiveis;
    }

    public void setExDisponíveis(int exDisponiveis) {
        this.exDisponiveis = exDisponiveis;
    }

    public int getExReservadas() {
        return exReservadas;
    }

    public void setExReservadas(int exReservadas) {
        this.exReservadas = exReservadas;
    }

    public int getExEmprestadas() {
        return exEmprestadas;
    }

    public void setExEmprestadas(int exEmprestadas) {
        this.exEmprestadas = exEmprestadas;
    }

    @Override
    public Integer getId() {
        return item.getId();
    }
    
}

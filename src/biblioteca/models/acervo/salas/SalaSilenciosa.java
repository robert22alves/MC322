package biblioteca.models.acervo.salas;

public class SalaSilenciosa extends Sala{
    private int assentos;
    private boolean cabinesIndividuais;

    public SalaSilenciosa() {
        super();
        
        this.assentos = 0;
        this.cabinesIndividuais = false;
    }

    //GETTERS N SETTERS
    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public boolean isCabinesIndividuais() {
        return cabinesIndividuais;
    }

    public void setCabinesIndividuais(boolean cabinesIndividuais) {
        this.cabinesIndividuais = cabinesIndividuais;
    }

}

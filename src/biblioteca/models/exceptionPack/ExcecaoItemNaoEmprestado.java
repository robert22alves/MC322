package biblioteca.models.exceptionPack;

public class ExcecaoItemNaoEmprestado extends Exception {

    public ExcecaoItemNaoEmprestado(String mensagem){
    super(mensagem);
}
}
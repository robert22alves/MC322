package biblioteca.models.membrosPack;

import biblioteca.models.Data;

public class Professor extends MembroAbs{
    public Professor(String nome, String identificacao, String endereco, String contato, Data dataRegistro) {
        super(nome, identificacao, endereco, contato, dataRegistro, 7, 30, 0.75);
    }
}

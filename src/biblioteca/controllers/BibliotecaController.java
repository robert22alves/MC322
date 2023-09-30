package biblioteca.controllers;

import java.util.List;

import biblioteca.models.membros.Membro;
import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}
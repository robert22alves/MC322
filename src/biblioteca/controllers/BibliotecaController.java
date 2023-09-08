package biblioteca.controllers;

import java.util.List;

import biblioteca.models.itensPack.ItemMultimidia;
import biblioteca.models.membrosPack.Membro;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}
package biblioteca.controllers;

import java.util.List;

import biblioteca.models.membrosPack.Membro;
import biblioteca.models.multimidiaPack.ItemMultimidia;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}
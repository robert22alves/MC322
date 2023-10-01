package biblioteca.controllers;

import java.util.List;

import biblioteca.models.membros.Membro;
import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;
import biblioteca.models.dataStructure.AVLtree;
import biblioteca.models.funcionarios.Usuario;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
    AVLtree<String, Usuario> getLogins();
}
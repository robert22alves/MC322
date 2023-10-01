package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.membros.Membro;
import biblioteca.models.acervo.itensMultimidia.ItemMultimidia;
import biblioteca.models.dataStructure.AVLtree;
import biblioteca.models.funcionarios.Usuario;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<ItemMultimidia> itens;
    private AVLtree<String, Usuario> logins;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
        logins = new AVLtree<>();
        Usuario usuario0 = new Usuario("admin", "123", 3);
        logins.inserir(usuario0.getUsuario(), usuario0);
    }

    @Override
    public List<ItemMultimidia> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, ItemMultimidia item) {
        // Lógica de empréstimo
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, ItemMultimidia item) {
        // Lógica de devolução
        return true;
    }

    public AVLtree<String, Usuario> getLogins() {
        return logins;
    }
}
package biblioteca.views;

import java.util.List;

import biblioteca.models.multimidiaPack.ItemMultimidia;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<ItemMultimidia> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}
package biblioteca.controllers;

import java.util.List;

import biblioteca.models.libmember.Membro;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(String identificacao);
}
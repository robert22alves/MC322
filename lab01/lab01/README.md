## Elementos

- LIVRO -> EDIÇÃO -> EXEMPLAR
- MEMBRO
- FUNCIONÁRIO
- EMPRÉSTIMO

## Relacionamentos

Em um `LIVRO`:
- Cada `LIVRO` possui 1+ `EDIÇÕES`
- Cada `LIVRO` possui 1+ `AUTORES`
- Cada `AUTOR` possui 1+ `LIVROS` de 1+ `EDIÇÕES`
- Cada `EDIÇÃO` possui um total de `EXEMPLARES` para `EMPRÉSTIMOS`
- Cada `EXEMPLAR` possui um `TOMBO / REGISTRO`

Em um `EMPRÉSTIMO`, um `LIVRO / EXEMPLAR` é emprestado a um `MEMBRO` durante um `PERÍODO` por um `FUNCIONÁRIO`

Em um `FUNCIONÁRIO` é registrado os `EMPRÉSTIMOS` feitos

Em um `MEMBRO` é registrado os `LIVROS / EXEMPLARES` em posse e os `PERÍODOS`

Em uma `EDIÇÃO DE LIVRO` é registrado os `MEMBROS` com posse de um `EXEMPLAR`

Em um `EXEMPLAR` é registrado um histórico de `EMPRÉSTIMOS`

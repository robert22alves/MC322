package emprestimo;

import controle_livros.Livro;
import controle_membros.Membro;

public class Ctrl_Emprestimo{

    public void adicionar_emp(Membro membro, Livro livro, Funcionario funcionario, String dt_emp, String dt_dev){
        if(membro.getEmprestimos() == membro.getTotal()){
            System.out.println("Numero total de emprestimos atingido");
            return;
        }

        else if(livro.getDisponiveis() == 0){
            System.out.println("Livro indisponivel");
            return;
        }
        membro.adicionar(livro.getInfo(), dt_emp, dt_dev);
        livro.adicionar(membro.getInfo(), dt_emp, dt_dev);

        System.out.println("O livro " +livro.getInfo().getTitulo() + " foi emprestado ao membro " +membro.getInfo().getNome() + " pelo funcionario " +funcionario.getNome());
    }

    public void remover_emp(Membro membro, Livro livro){

            membro.remover(livro.getInfo());
            livro.remover(membro.getInfo());

            System.out.println("O membro " +membro.getInfo().getNome() + " devolveu o livro " +livro.getInfo().getTitulo());
    }
}
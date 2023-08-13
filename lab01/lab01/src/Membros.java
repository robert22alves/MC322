import controle_membros.Membro;

public class Membros {
    private Membro[] membros;
    private int quantidade_Membros;

    public Membros(int quantidade_total) {
        this.membros = new Membro[quantidade_total];
        this.quantidade_Membros = 0;
    }

    public void adicionarMembro(Membro membro) {
        if (quantidade_Membros < membros.length){
            membros[quantidade_Membros++] = membro;
            System.out.println("Novo membro:  " + membro.getInfo().getNome());
        }
        else {
            System.out.println("Nao podemos aceitar mais membros no momento");
        }
    }

    public void imprimirMembros(){
        System.out.println("Membros da Biblioteca:");
        for (int i = 0; i < membros.length; i++){
            membros[i].imprimirInfo();
            System.out.print('\n');
        }
    }

    public Membro[] getMembros() {
        return membros;
    }

    public int getQuantidade_Membros() {
        return quantidade_Membros;
    }    
}

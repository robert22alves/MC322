package biblioteca.models.itensPack;

import biblioteca.models.Reservaveis;

public class Equipamentos implements Reservaveis{
    private String equipamento;

    private Equipamentos(String equipamento) {
        this.equipamento = equipamento;
    }

    private class Informatica extends Equipamentos{
        private String processador;
        private int ram;
        private int rom;
        private String acessorios;

        public Informatica(String equipamento, String processador, int ram, int rom, String acessorios){
            super(equipamento);
            this.processador = processador;
            this.ram = ram;
            this.rom = rom;
            this.acessorios = acessorios;
        }

        public String getProcessador() {
            return processador;
        }

        public int getRam() {
            return ram;
        }

        public int getRom() {
            return rom;
        }

        public String getAcessorios() {
            return acessorios;
        }
    }

    private class Audiovisual extends Equipamentos{
        public Audiovisual(String equipamento){
            super(equipamento);
        }
    }

    private class Impressao extends Equipamentos{
        public Impressao(String equipamento){
            super(equipamento);
        }
    }

    enum CategoriaEquipamento {
        INFORMATICA, AUDIOVISUAL, IMPRESSAO
    }

    private CategoriaEquipamento categoria;

    public CategoriaEquipamento getCategoria() {
        return categoria;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}

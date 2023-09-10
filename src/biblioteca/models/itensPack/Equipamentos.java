package biblioteca.models.itensPack;

public class Equipamentos {
    private String equipamento;

    private class Informatica extends Equipamentos{
        private String processador;
        private int ram;
        private int rom;
        private String acessorios;

        public Informatica(String equipamento, String processador, int ram, int rom, String acessorios){
            this.setEquipamento(equipamento);
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
            this.setEquipamento(equipamento); 
        }
    }

    private class Impressao extends Equipamentos{
        public Impressao(String equipamento){
            this.setEquipamento(equipamento);
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

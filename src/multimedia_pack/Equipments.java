package multimedia_pack;

import libservices_pack.Lending;

public class Equipments {

    private String equipment; //nome do equipamento a ser emprestado

    private Lending lending; //Emprestimo atual
    private boolean isAvailable = true;
    private boolean isReserved = false;

    public enum Equipment_Category{
        COMPUTING, AUDIO_VISUAL, PRINTER
    }

    public class Computing{

        private String processor;
        private int ram;
        private int rom;
        private String acessories;

        public Computing(String processor, int ram, int rom, String acessories, String equipment){
            Equipments.this.equipment = equipment;
            this.processor = processor;
            this.ram = ram;
            this.rom = rom;
            this.acessories = acessories;
        }

        //Getters
        public String getProcessor() {
            return processor;
        }
        public int getRam() {
            return ram;
        }
        public int getRom() {
            return rom;
        }
        public String getAcessories() {
            return acessories;
        }
        public Lending getLending() {
            return lending;
        }
        public boolean isAvailable() {
            return isAvailable;
        }
    
        public boolean isReserved() {
            return isReserved;
        }
        public void setAvailable(boolean isAvailable) {
            Equipments.this.isAvailable = isAvailable;
        }
    
        public void setReserved(boolean isReserved) {
            Equipments.this.isReserved = isReserved;
        }

        // Metodos
    public boolean canLending() {
        return (isAvailable && !isReserved);
    }
    
    public void makeLending(Lending l) {
        lending = l;
        isAvailable = false;
    }

    public void makeReturn() {
        lending = null;
        isAvailable = true;
    }
    }

    public class Audio_Visual{

        public Audio_Visual(String equipment){
            Equipments.this.equipment = equipment;
        }

        //Getters
        public Lending getLending() {
            return lending;
        }
        public boolean isAvailable() {
            return isAvailable;
        }
    
        public boolean isReserved() {
            return isReserved;
        }
        public void setAvailable(boolean isAvailable) {
            Equipments.this.isAvailable = isAvailable;
        }
    
        public void setReserved(boolean isReserved) {
            Equipments.this.isReserved = isReserved;
        }
        
    // Metodos
    public boolean canLending() {
        return (isAvailable && !isReserved);
    }
    
    public void makeLending(Lending l) {
        lending = l;
        isAvailable = false;
    }

    public void makeReturn() {
        lending = null;
        isAvailable = true;
    }
    }

    public class Printer{

        public Printer(String equipment){
            Equipments.this.equipment = equipment;
        }

        //Getters
        public Lending getLending() {
            return lending;
        }
        public boolean isAvailable() {
            return isAvailable;
        }
    
        public boolean isReserved() {
            return isReserved;
        }
        public void setAvailable(boolean isAvailable) {
            Equipments.this.isAvailable = isAvailable;
        }
    
        public void setReserved(boolean isReserved) {
            Equipments.this.isReserved = isReserved;
        }

        // Metodos
    public boolean canLending() {
        return (isAvailable && !isReserved);
    }
    
    public void makeLending(Lending l) {
        lending = l;
        isAvailable = false;
    }

    public void makeReturn() {
        lending = null;
        isAvailable = true;
    }
    }

    //Getter
    public String getEquipment() {
        return equipment;
    }


}
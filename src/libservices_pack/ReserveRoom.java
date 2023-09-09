package libservices_pack;

import libmembers_pack.Member;
import java.util.ArrayList;

public class ReserveRoom {

    public enum StatusReserva{
        PENDENTE, CONFIRMADA, CANCELADA
    }

    private Member member;

     public class Single_Room{

        private boolean available_computer; //se ha computador disponivel
        private int num_room; // numero da sala
       
        public Single_Room(boolean available_computer, int num_room, Member member){
            ReserveRoom.this.member = member;
            this.available_computer = available_computer;
            this.num_room = num_room;
        }

        //Getters
        public boolean isAvailable_computer() {
            return available_computer;
        }
         public int getNum_room() {
            return num_room;
        }

    }

    public class Group_Room{

        private boolean available_equipment; //se ha equipamento para apresentacao
        private int cap_max; // capacidade maxima

        public Group_Room(boolean available_equipment, int cap_max, Member member){
            ReserveRoom.this.member = member;
            this.available_equipment = available_equipment;
            this.cap_max = cap_max;
        }

        //Getter
        public boolean isAvailable_equipment() {
            return available_equipment;
        }
        public int getCap_max() {
            return cap_max;
        }

    }

    public class Silent_Room{

        private boolean available_cabin; // se ha cabines individuais disponiveis
        private int num_seats; // numero total de assentos

        public Silent_Room(boolean available_cabin, int num_seats, Member member){
            ReserveRoom.this.member = member;
            this.available_cabin = available_cabin;
            this.num_seats = num_seats;
        }

        //Getter
        public boolean isAvailable_cabin() {
            return available_cabin;
        }
        public int getNum_seats() {
            return num_seats;
        }
        
    }

    public class Multimedia_Room{

        private ArrayList<String> available_items;

        public Multimedia_Room(Member member){
            ReserveRoom.this.member = member;
        }

        //Getter
        public ArrayList<String> getAvailable_items() {
            return available_items;
        }       

    }

    //Getter
    public Member getMember() {
        return member;
    }
}
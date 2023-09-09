package multimedia_pack;

import java.util.ArrayList;

public class Multimedia {

    public enum Multimedia_Format{
        AUDIO, VIDEO, SOFTWARE
    }

    private ArrayList<Audio_CD> audio;
    private ArrayList<Video_DVD> video;
    
    public class Audio{

        public Audio(ArrayList<Audio_CD> audio){
            Multimedia.this.audio = audio;
        }

    }

    public class Video{

        public Video(ArrayList<Video_DVD> video){
            Multimedia.this.video = video;
        }

    }

    public class Software {

        private String type_software; //tipo de software

        public Software(String type_software){
            this.type_software = type_software;
        }

        //Getter
        public String getType_software() {
            return type_software;
        }
    }

    //Getters
    public ArrayList<Audio_CD> getAudio() {
        return audio;
    }
    public ArrayList<Video_DVD> getVideo() {
        return video;
    }

}

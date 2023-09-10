package biblioteca.models.itensPack;

public class Multimidia implements ItemMultimidia{
    private String titulo;
    private String detalhes;
    
    private class Audio extends Multimidia{
        private String tipoAudio;

        public Audio(String titulo, String detalhes, FormatoMultimidia formato, String tipoAudio) {
            super(titulo, detalhes, FormatoMultimidia.AUDIO);
            this.tipoAudio = tipoAudio;
        }

        public String getTipoAudio() {
            return tipoAudio;
        }
    }

    private class Video extends Multimidia{
        private String tipoVideo;

        public Video(String titulo, String detalhes, FormatoMultimidia formato, String tipoVideo) {
            super(titulo, detalhes, FormatoMultimidia.VIDEO);
            this.tipoVideo = tipoVideo;
        }

        public String getTipoVideo() {
            return tipoVideo;
        }
    }

    private class Software extends Multimidia{
        private String tipoSoftware;

        public Software(String titulo, String detalhes, FormatoMultimidia formato, String tipoSoftware) {
            super(titulo, detalhes, FormatoMultimidia.SOFTWARE);
            this.tipoSoftware = tipoSoftware;
        }

        public String getTipoSoftware() {
            return tipoSoftware;
        }
    }

    enum FormatoMultimidia{
        AUDIO, VIDEO, SOFTWARE
    }

    private FormatoMultimidia formato;

    private Multimidia(String titulo, String detalhes, FormatoMultimidia formato) {
        this.detalhes = detalhes;
        this.titulo = titulo;
        this.formato = formato;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getDetalhes() {
        return detalhes;
    }

    public FormatoMultimidia getFormato() {
        return formato;
    }

    
}

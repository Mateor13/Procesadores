package procesadores;

public class procesadores_intel extends procesadores_escritores{
    Boolean tarjeta_de_video;

    public procesadores_intel() {
    }

    public procesadores_intel(int nucleo, Double consumo, Double velocidad, String nombre, String socket, Boolean tarjeta_de_video) {
        super(nucleo, consumo, velocidad, nombre, socket);
        this.tarjeta_de_video = tarjeta_de_video;
    }

    public Boolean getTarjeta_de_video() {
        return tarjeta_de_video;
    }

    public void setTarjeta_de_video(Boolean tarjeta_de_video) {
        this.tarjeta_de_video = tarjeta_de_video;
    }

    public void imprimir_datos_escritorio(){
        System.out.println(this.tarjeta_de_video);
    }
}

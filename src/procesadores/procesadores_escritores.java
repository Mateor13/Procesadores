package procesadores;

public class procesadores_escritores extends procesadores{
    String socket;

    public procesadores_escritores() {
    }

    public procesadores_escritores(int nucleo, Double consumo, Double velocidad, String nombre, String socket) {
        super(nucleo, consumo, velocidad, nombre);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void impirmir_datos_escritorio(){
        System.out.println(this.socket);
    }

}
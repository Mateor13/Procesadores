package procesadores;

public class procesadores_AMD extends procesadores_escritores{
    Boolean sensor_temperatura;
    public procesadores_AMD() {
    }

    public procesadores_AMD(int nucleo, Double consumo, Double velocidad, String nombre, String socket, Boolean sensor_temperatura) {
        super(nucleo, consumo, velocidad, nombre, socket);
        this.sensor_temperatura = sensor_temperatura;
    }
    //Stters y getters

    public Boolean getSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(Boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }
    //Imprimir datos
    public void imprimir_datos_escritorio(){
        System.out.println("Cuenta con sensor de temperatura: " + getSensor_temperatura());
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Clase hija AMD");
    }
}

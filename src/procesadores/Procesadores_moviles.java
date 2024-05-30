package procesadores;

public class Procesadores_moviles extends procesadores{
    Boolean optimizacion_energia;

    public Procesadores_moviles() {
    }

    public Procesadores_moviles(int nucleo, Double consumo, Double velocidad, String nombre, Boolean optimizacion_energia) {
        super(nucleo, consumo, velocidad, nombre);
        this.optimizacion_energia = optimizacion_energia;
    }
    //setter y getter

    public Boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(Boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }
    //Mateodos personalizados
    //Imprimir datos
    public void imprimir_datos_moviles(){
        System.out.println("Acepta optimización energia: " + getOptimizacion_energia());
    }
}

package procesadores;

public class Procesadores_moviles extends procesadores{
    Boolean optimizacion_energia;
    int nucleosEficientes;
    int nucleosRendimiento;

    public Procesadores_moviles() {
    }

    public Procesadores_moviles(int nucleo, Double consumo, Double velocidad, String nombre, Boolean optimizacion_energia) {
        super(nucleo, consumo, velocidad, nombre);
        this.optimizacion_energia = optimizacion_energia;
        this.nucleosEficientes = nucleo;
        this.nucleosRendimiento = nucleosEficientes;
    }
    //setter y getter

    public Boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(Boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public int getNucleosEficientes() {
        return nucleosEficientes;
    }

    public void setNucleosEficientes(int nucleosEficientes) {
        this.nucleosEficientes = nucleosEficientes;
    }

    public int getNucleosRendimiento() {
        return nucleosRendimiento;
    }

    public void setNucleosRendimiento(int nucleosRendimiento) {
        this.nucleosRendimiento = nucleosRendimiento;
    }

    //Mateodos personalizados
    //Imprimir datos
    public void imprimir_datos_moviles(){
        System.out.println("Acepta optimización energia: " + getOptimizacion_energia());
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Nucleos de Eficiencia: " + getNucleosEficientes());
        System.out.println("Nucleos de Rendimiento: " + getNucleosRendimiento());
        System.out.println("Total de Nucleos: " + getNucleo());
        System.out.println("Consumo: " + getConsumo() + " watts");
        System.out.println("Velocidad: " + getVelocidad() + "Ghz");
    }
}

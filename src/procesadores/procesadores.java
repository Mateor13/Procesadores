package procesadores;

public class procesadores {
    int nucleo;
    Double consumo, velocidad;
    String nombre;

    public procesadores() {
    }

    public procesadores(int nucleo, Double consumo, Double velocidad, String nombre) {
        this.nucleo = nucleo;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    //setters y getters


    public int getNucleo() {
        return nucleo;
    }

    public void setNucleo(int nucleo) {
        this.nucleo = nucleo;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodos personalizados
    //Imprimir datos
    public void mostrarDatos() {
        System.out.println("Está es la clase principal en el primer nivel:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nucleo: " + getNucleo());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Velocidad: " + getVelocidad());
    }
}

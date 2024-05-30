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

}

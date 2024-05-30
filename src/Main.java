import procesadores.procesadores;
import procesadores.procesadores_AMD;
import procesadores.Procesadores_moviles;
import procesadores.procesadores_intel;

public class Main {
    public static void main(String[] args) {

        //integrante 1
        procesadores_AMD p1 = new procesadores_AMD();
        procesadores_AMD p2 = new procesadores_AMD(10, 5.0, 7.0,"Ryzen 5", "AM4", true);
        //integrante 2
        procesadores_intel p3 = new procesadores_intel();
        procesadores_intel p4 = new procesadores_intel(6,95.0,3.5,"Core i5","LGA1156",true);
        //integrante 1
        Procesadores_moviles p5 = new Procesadores_moviles();
        Procesadores_moviles p6 = new Procesadores_moviles(4,3.5,7.9,"Snapdragon 8G",true);
    }
}
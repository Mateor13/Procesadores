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
        //amd
        procesadores_AMD p7 = new procesadores_AMD(7, 8.5, 10.0,"Ryzen 7", "AM4", false);
        procesadores_AMD p8 = new procesadores_AMD(5, 5.4, 9.0,"Ryzen 9", "AM4", false);

        // Grupo 1

        // Integrante Richard Soria
        procesadores_AMD p12 = new procesadores_AMD(12, 105.0, 3.7,"AMD Ryzen™ 9 5900X", "AM4", true);
        procesadores_AMD p13 = new procesadores_AMD(8, 35.0, 3.6,"AMD Ryzen™ 7 PRO 8700GE", "AM5", true);
        procesadores_AMD p14 = new procesadores_AMD(6, 65.0, 4.3,"AMD Ryzen™ 5 8600G", "AM4", true);

        // Grupo 2

        // Grupo 3
    }
}
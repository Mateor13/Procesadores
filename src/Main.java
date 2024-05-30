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

        //Ithan Camacho
        procesadores_intel p9 = new procesadores_intel(12,328.0,4.7,"Intel® Core™ i7-1255U","BGA",false);
        procesadores_intel p10 = new procesadores_intel(8,28.0,4.0,"intel core i5-1135g7","LGA1156",true);
        procesadores_intel p11 = new procesadores_intel(12,32.0,4.7,"Intel® Core™ i7-1255U","LGA1156",false);

        // Integrante Richard Soria
        procesadores_AMD p12 = new procesadores_AMD(12, 105.0, 3.7,"AMD Ryzen™ 9 5900X", "AM4", true);
        procesadores_AMD p13 = new procesadores_AMD(8, 35.0, 3.6,"AMD Ryzen™ 7 PRO 8700GE", "AM5", true);
        procesadores_AMD p14 = new procesadores_AMD(6, 65.0, 4.3,"AMD Ryzen™ 5 8600G", "AM4", true);
        // Grupo 2

        //Anthony Astudillo
        procesadores_intel p15 = new procesadores_intel(20,260.45,5.6,"intel core i7-14700KF","LGA1700",true);
        procesadores_AMD p16 = new procesadores_AMD(7, 105.0, 4.1,"Ryzen 5 4500 4gen", "AM4", false);
        Procesadores_moviles p17 = new Procesadores_moviles(6,7.25,3.23,"Chip A15 Bionic",true);

        //Mateo Torres
        procesadores_AMD m1 = new procesadores_AMD(16, 105.0, 3.4,"Ryzen 9 5950X", "AM4", true);
        Procesadores_moviles m2 = new Procesadores_moviles(4,45.5,3.5,"Snapdragon 750",true);
        procesadores_intel m3 = new procesadores_intel(16, 125.4, 3.2,"Core i9-12900K", "LGA 1700", false);

        // Grupo 3

        // Carlos Perez

        procesadores_AMD p18 = new procesadores_AMD(6, 65, 3.5, "AMD RYZEN5 5600X", "AM4", true);
        procesadores_AMD p19 = new procesadores_AMD(8, 75, 3.9, "AMD RYZEN5 8600G", "AM5", true);
        procesadores_AMD p20 = new procesadores_AMD(8, 80, 3.7, "AMD RYZEN7 5700X", "AM4", true);

        
    }
}
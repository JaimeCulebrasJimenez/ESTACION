package actividad.pkg7.pkg10.clases;

import Maquinaria.Locomotoras;
import Maquinaria.Trenes;
import Personal.JefesDeEstacion;
import Personal.Maquinistas;
import Personal.Mecanicos;
import java.time.LocalDate;
import java.time.Month;

public class Actividad710Clases {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025, Month.MARCH, 6);

        Mecanicos Mecanico1 = new Mecanicos("Juan", 123456789, "frenos");
        Locomotoras Locomotora1 = new Locomotoras("L-12345", 4000, 2010, Mecanico1);
        Maquinistas Maquinista1 = new Maquinistas("Carlos", "58075451E", 2000, "Jefa de tren");
        Trenes Tren1 = new Trenes(Locomotora1, Maquinista1);
        JefesDeEstacion Jefe1 = new JefesDeEstacion("Sergio", "1283593A", d1);

        Tren1.engancharVagon(001, 2000, "Prendas de ropa");
        Tren1.engancharVagon(002, 3500, "Electronicos");
        Tren1.engancharVagon(003, 3000, "Alimentos");

        System.out.println("Locomotora :" + Locomotora1.toString());
        System.out.println(Maquinista1.getNombre() + " " + Jefe1.getNombre() + " " + Maquinista1.getRango());

    }

}

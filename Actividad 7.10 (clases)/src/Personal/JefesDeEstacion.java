package Personal;

import java.time.LocalDate;
import java.util.Date;

public class JefesDeEstacion {

    String nombre;
    String DNI;
    LocalDate nombramiento;

    public JefesDeEstacion(String nombre, String DNI, LocalDate nombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.nombramiento = nombramiento;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    

    
}

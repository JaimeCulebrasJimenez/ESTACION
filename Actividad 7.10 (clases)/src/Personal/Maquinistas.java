package Personal;

public class Maquinistas extends Persona {

    int Sueldo;
    String rango;

    public Maquinistas(String nombre, String DNI, int Sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Sueldo = Sueldo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }
    
    
    
    

}

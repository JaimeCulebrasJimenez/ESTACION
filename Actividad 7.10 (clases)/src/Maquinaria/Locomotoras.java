package Maquinaria;

import Personal.Mecanicos;

public class Locomotoras {

    String matricula;
    int potencia;
    int añoFab;
    Mecanicos mec;

    public Locomotoras(String matricula, int potencia, int añoFab, Mecanicos mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFab = añoFab;
        this.mec = mec;
    }

    @Override
    public String toString() {
        return matricula + " " + potencia + " " + mec; 
    }
    
    
    
}

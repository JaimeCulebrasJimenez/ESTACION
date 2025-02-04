package Maquinaria;

import Personal.Maquinistas;

public class Trenes {

    Locomotoras locomotora;
    Vagones vagones[];
    Maquinistas maquinista;
    private int numVagones;

    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;

        vagones = new Vagones[5];
        numVagones = 0;
    }

    public void engancharVagon(int ID, int cargaMax, String Mercancia) {
        if (numVagones > 5) {
            System.out.println("No se pueden añadir más vagones");
        } else {
            Vagones vagon = new Vagones(ID, cargaMax, Mercancia);
            vagones[numVagones] = vagon;
            numVagones++;
        }
    }
}

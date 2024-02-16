package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class ListaElementos {
    ArrayList<Elemento> Elemento = new ArrayList<>();
    
    public ListaElementos(){
        Elemento.add(new Elemento("España", "Países", "españa.jpg", 1, new Date()));
        Elemento.add(new Elemento("Noruega", "Países", "noruega.jpg", 2, new Date()));
        Elemento.add(new Elemento("Alemania", "Países", "alemania.jpg", 3, new Date()));
        Elemento.add(new Elemento("Europa", "Continente", "europa.jpg", 4, new Date()));
        Elemento.add(new Elemento("Oceanía", "Continente", "oceanía.jpg", 5, new Date()));
    }

    public ArrayList<Elemento> getElemento() {
        return Elemento;
    }
    
}

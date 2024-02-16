package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class ListaElementos {
    ArrayList<Elemento> Elemento = new ArrayList<>();
    
    public ListaElementos(){
        Elemento.add(new Elemento("España", "Países", "españa.jpg", 1, new Date("11-09-2002")));
        Elemento.add(new Elemento("Noruega", "Países", "noruega.jpg", 2, new Date("20-02-1992")));
        Elemento.add(new Elemento("Alemania", "Países", "alemania.jpg", 3, new Date("11-09-1915")));
        Elemento.add(new Elemento("Europa", "Continente", "europa.jpg", 4, new Date("11-09-2002")));
        Elemento.add(new Elemento("Oceanía", "Continente", "oceanía.jpg", 5, new Date("11-09-2024")));
    }

    public ArrayList<Elemento> getElemento() {
        return Elemento;
    }
    
}

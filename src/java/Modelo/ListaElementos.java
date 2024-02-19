package Modelo;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListaElementos {
    ArrayList<Elemento> Elemento = new ArrayList<>();
    
    public ListaElementos(){
        Elemento.add(new Elemento("España", "Países", "españa.jpg", 1, CambiarFormato("11-09-2002")));
        Elemento.add(new Elemento("Noruega", "Países", "noruega.jpg", 2,  CambiarFormato("20-02-1992")));
        Elemento.add(new Elemento("Alemania", "Países", "alemania.jpg", 3,  CambiarFormato("11-09-1915")));
        Elemento.add(new Elemento("Europa", "Continente", "europa.jpg", 4,  CambiarFormato("11-09-2002")));
        Elemento.add(new Elemento("Oceanía", "Continente", "oceanía.jpg", 5,  CambiarFormato("11-09-2024")));
    }

    public ArrayList<Elemento> getElemento() {
        return Elemento;
    }
    
    public Date CambiarFormato(String f) { 
    Date fecha=new Date();
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = sdf.parse(f);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return fecha;
        
    }
}
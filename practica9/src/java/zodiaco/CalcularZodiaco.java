package zodiaco;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcularZodiaco {
    
    private String zodiaco;
    private Date fecha;
    private ArrayList<String> zodiacos;
    private int edad;
   
    public CalcularZodiaco(String fechaNacimento){
        
        CambiarStringDate(fechaNacimento);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
           
        zodiacos = new ArrayList<>();
        zodiacos = lista();
        
        EsCogerZodiaco(calendar);
        Obtener_edad(fechaNacimento);
    }
    
    public void Obtener_edad(String f){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.parse(f);
        edad =  Period.between(fechaNacimiento, fechaActual).getYears();
    }
    
    public void EsCogerZodiaco(Calendar calendar){
        switch(calendar.get(Calendar.MONTH)){
            case 0: zodiaco = zodiacos.get(0);
                break;
            case 1: zodiaco = zodiacos.get(1);
                break;
            case 2: zodiaco = zodiacos.get(2);
                break;
            case 3: zodiaco = zodiacos.get(3);
                break;
            case 4: zodiaco = zodiacos.get(4);
                break;
            case 5: zodiaco = zodiacos.get(5);
                break;
            case 6: zodiaco = zodiacos.get(6);
                break;
            case 7: zodiaco = zodiacos.get(7);
                break;
            case 8: zodiaco = zodiacos.get(8);
                break;
            case 9:  zodiaco = zodiacos.get(9);
                break;
            case 10: zodiaco = zodiacos.get(10);
                break;
             case 11:  zodiaco = zodiacos.get(11);
                break;
        }
    }
    
    public static ArrayList<String> lista(){
        ArrayList<String> lista = new ArrayList<>();
            lista.add("Acuario");
            lista.add("Piscis");
            lista.add("Aries");
            lista.add("Tauro");
            lista.add("Géminis");
            lista.add("Cáncer");
            lista.add("Leo");
            lista.add("Virgo");
            lista.add("Libra");
            lista.add("Escorpio");
            lista.add("Sagitario");
            lista.add("Capricornio");
            
        return lista;
    }

    public String getZodiaco() {
        return zodiaco;
    }
    
    public Date getfecha(){
        return fecha;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void  CambiarStringDate(String f){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = sdf.parse(f);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}

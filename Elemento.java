package zodiaco;

import java.util.Date;

public class Elemento {
    
    private String nombre, grupo, foto;
    private int numero;
    private Date fecha;

    public Elemento(String nombre, String grupo, String foto, int numero, Date fecha) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.foto = foto;
        this.numero = numero;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}

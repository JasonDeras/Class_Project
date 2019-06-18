package projectro_clase;

import java.util.ArrayList;

public class Area {

    private String nombre;
    private ArrayList<Personal> per = new ArrayList();

    public Area() {
    }

    public Area(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personal> getPer() {
        return per;
    }

    public void setPer(ArrayList<Personal> per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Area{" + "nombre=" + nombre + ", per=" + per + '}';
    }
    
}

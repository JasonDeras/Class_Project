package projectro_clase;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private ArrayList<Area> areas = new ArrayList();

    public Departamento() {
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", areas=" + areas + '}';
    }
    
}

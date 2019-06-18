package projectro_clase;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private String mision;
    private String vision;
    private String objectivos;
    private String politicas;
    private ArrayList<String> telefonos = new ArrayList();
    private String correo;
    private String direccion;
    private String director;

    public Empresa() {
    }

    public Empresa(String nombre, String mision, String vision, String objectivos, String politicas, String correo, String direccion, String director) {
        this.nombre = nombre;
        this.mision = mision;
        this.vision = vision;
        this.objectivos = objectivos;
        this.politicas = politicas;
        this.correo = correo;
        this.direccion = direccion;
        this.director = director;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getObjectivos() {
        return objectivos;
    }

    public void setObjectivos(String objectivos) {
        this.objectivos = objectivos;
    }

    public String getPoliticas() {
        return politicas;
    }

    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", mision=" + mision + ", vision=" + vision + ", objectivos=" + objectivos + ", politicas=" + politicas + ", telefonos=" + telefonos + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

}

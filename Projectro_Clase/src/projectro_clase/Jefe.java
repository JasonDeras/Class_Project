package projectro_clase;

import java.util.ArrayList;

public class Jefe extends Personal {

    private Gerente g;
    private float sueldo;
    private ArrayList<Personal> per = new ArrayList();

    public Jefe() {
    }

    public Jefe(String id, String contrasenia, String correo) {
        super(id, contrasenia, correo, "Jefe");
    }

    public Gerente getG() {
        return g;
    }

    public void setG(Gerente g) {
        this.g = g;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Personal> getPer() {
        return per;
    }

    public void setPer(ArrayList<Personal> per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

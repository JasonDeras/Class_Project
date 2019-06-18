package projectro_clase;

import java.util.Date;

public class Analista extends Personal {

    private Jefe j;
    private float salgo;
    private Date entrada;
    private Date salida;
    private String cargo;

    public Analista() {
    }

    public Analista(String id, String contrasenia, String correo) {
        super(id, contrasenia, correo, "Analista");
    }

    public Jefe getJ() {
        return j;
    }

    public void setJ(Jefe j) {
        this.j = j;
    }

    public float getSalgo() {
        return salgo;
    }

    public void setSalgo(float salgo) {
        this.salgo = salgo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

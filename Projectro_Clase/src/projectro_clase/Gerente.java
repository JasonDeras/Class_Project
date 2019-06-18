package projectro_clase;

public class Gerente extends Personal {

    private String director;
    private float saldo;

    public Gerente() {
    }

    public Gerente(String id, String contrasenia, String correo) {
        super(id, contrasenia, correo,"Gerente");
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

  

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

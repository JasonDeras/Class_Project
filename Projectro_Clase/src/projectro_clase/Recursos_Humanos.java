package projectro_clase;

public class Recursos_Humanos extends Personal {

    private float saldo;

    public Recursos_Humanos() {
    }

    public Recursos_Humanos(String id, String contrasenia, String correo) {
        super(id, contrasenia, correo,"Recursos Humanos");
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

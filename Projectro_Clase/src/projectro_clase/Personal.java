package projectro_clase;

public class Personal {

    private String id;
    private String contrasenia;
    private String correo;
    private String tipo;
    private float slado;

    public Personal() {
    }

    public Personal(String id, String contrasenia, String correo, String tipo) {
        this.id = id;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSlado() {
        return slado;
    }

    public void setSlado(float slado) {
        this.slado = slado;
    }

    @Override
    public String toString() {
        return id;
    }

   
}

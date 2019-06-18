package projectro_clase;

import java.util.*;

public class Administrador extends Personal {

    private ArrayList roles = new ArrayList();
    private Empresa emp;

    public Administrador() {
    }

    public Administrador(Empresa emp, String id, String contrasenia, String correo) {
        super(id, contrasenia, correo,"Administrador");
        this.emp = emp;
    }

    public ArrayList getRoles() {
        return roles;
    }

    public void setRoles(ArrayList roles) {
        this.roles = roles;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

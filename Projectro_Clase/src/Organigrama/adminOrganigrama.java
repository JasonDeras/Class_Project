package Organigrama;

import java.io.Serializable;
import java.util.ArrayList;


    public class adminOrganigrama implements Serializable {

        private String nombre;
        private String nombreClase;
        private int x;
        private int y;
        private String texto1;
        private String texto2;
        private ArrayList<String> casillas = new ArrayList();
        private static final long SerialVersionUID = 77L;

        public adminOrganigrama() {
        }

        public adminOrganigrama(String nombreClase, String nombre, int x, int y) {
            this.nombre = nombre;
            this.x = x;
            this.y = y;
            this.nombreClase = nombreClase;
        }

        public adminOrganigrama(String nombreClase, String nombre, int x, int y, String texto1) {
            this.nombre = nombre;
            this.x = x;
            this.y = y;
            this.texto1 = texto1;
            this.nombreClase = nombreClase;
        }

        public adminOrganigrama(String nombreClase, String nombre, int x, int y, String texto1, String texto2) {
            this.nombre = nombre;
            this.x = x;
            this.y = y;
            this.texto1 = texto1;
            this.texto2 = texto2;
            this.nombreClase = nombreClase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public String getTexto1() {
            return texto1;
        }

        public void setTexto1(String texto) {
            this.texto1 = texto;
        }

        public ArrayList<String> getCasillas() {
            return casillas;
        }

        public void setCasillas(ArrayList<String> casillas) {
            this.casillas = casillas;
        }

        public void setCasilla(String c) {
            this.casillas.add(c);
        }

        public String getTexto2() {
            return texto2;
        }

        public void setTexto2(String texto2) {
            this.texto2 = texto2;
        }

        public String getNombreClase() {
            return nombreClase;
        }

        public void setNombreClase(String nombreClase) {
            this.nombreClase = nombreClase;
        }

    }

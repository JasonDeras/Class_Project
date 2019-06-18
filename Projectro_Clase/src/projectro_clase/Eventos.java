package projectro_clase;

import java.util.*;

public class Eventos {

    private Date fecha;
    private String titulo;
    private String recordatorio;
    private String inicio;
    private String Final;

    public Eventos() {
    }

    public Eventos(Date fecha, String titulo, String recordatorio, String inicio, String Final) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorio = recordatorio;
        this.inicio = inicio;
        this.Final = Final;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(String recordatorio) {
        this.recordatorio = recordatorio;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha=" + fecha + ", titulo=" + titulo + ", recordatorio=" + recordatorio + ", inicio=" + inicio + ", Final=" + Final + '}';
    }
    
}

package projectro_clase;

import java.util.*;

public class Tareas {

    private Date fecha;
    private String titulo;
    private String recordatorio;
    private String anotaciones;

    public Tareas() {
    }

    public Tareas(Date fecha, String titulo, String recordatorio, String anotaciones) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorio = recordatorio;
        this.anotaciones = anotaciones;
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

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    @Override
    public String toString() {
        return "Tareas{" + "fecha=" + fecha + ", titulo=" + titulo + ", recordatorio=" + recordatorio + ", anotaciones=" + anotaciones + '}';
    }

    
}

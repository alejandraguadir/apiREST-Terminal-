package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un objeto Viaje.
 */
public class Viaje {
    /**
     * Atributos de clase Viaje.
     */
    private String id;
    private String fechaRegistro;

    private List<Bus> buses;


    /**
     * Constructor para crear un objeto Viaje.
     */


    public Viaje(String id, String fechaRegistro) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.buses = new ArrayList<>();
    }

    /**
     * Consultores y Modificadores
     */

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

}

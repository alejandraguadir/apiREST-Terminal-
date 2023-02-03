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

    private String destino;
    private List<Bus> buses;



    /**
     * Constructor para crear un objeto Viaje.
     *
     * @param id   identificador del viaje.
     * @param fechaRegistro fecha del viaje.
     */


    public Viaje(String id, String destino, String fechaRegistro) {
        this.id = id;
        this.destino=destino;
        this.fechaRegistro = fechaRegistro;
        this.buses = new ArrayList<>();
    }

    /**
     * Consultores y Modificadores
     */

    public String getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

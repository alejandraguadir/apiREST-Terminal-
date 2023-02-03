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
    private String date;
    private List<Destino> destinos;
    private List<Bus> buses;
    private List<Pasajero> pasajeros;

    /**
     * Constructor para crear un objeto Viaje.
     *
     * @param id   identificador del viaje.
     * @param date fecha del viaje.
     */


    public Viaje(String id, String date) {
        this.id = id;
        this.date = date;
        this.destinos = new ArrayList<>();
        this.buses = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinoSeleccionado) {
        this.destinos = destinos;
    }

    public List<Bus> getBuses(List<Bus> busSeleccionado) {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<Pasajero> getPasajeros(List<Pasajero> pasajerosRegistrados) {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}

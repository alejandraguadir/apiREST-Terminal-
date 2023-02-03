package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String id;
    private String date;
    private List<Destino> destinos;
    private List<Bus> buses;
    private List<Pasajero> pasajeros;


    /**
 * Constructor
 */

    public Viaje(String id, String date) {
        this.id = id;
        this.date = date;
        this.destinos=  new ArrayList<>();
        this.buses =  new ArrayList<>();
        this.pasajeros=  new ArrayList<>();
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

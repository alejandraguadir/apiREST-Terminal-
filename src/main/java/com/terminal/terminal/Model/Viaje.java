package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String id;
    private String date;
    private List<Destino> destinoAsignado;
    private List<Bus> busAsignado;
    private List<Pasajero> pasajeros;
/**
 * Constructor
 */

    public Viaje(String id, String date) {
        this.id = id;
        this.date = date;
        this.destinoAsignado =  new ArrayList<>();
        this.busAsignado =  new ArrayList<>();
        this.pasajeros =  new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public List<Destino> getDestinoAsignado() {
        return destinoAsignado;
    }

    public List<Bus> getBusAsignado() {
        return busAsignado;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDestinoAsignado(List<Destino> destinoAsignado) {
        this.destinoAsignado = destinoAsignado;
    }

    public void setBusAsignado(List<Bus> busAsignado) {
        this.busAsignado = busAsignado;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}

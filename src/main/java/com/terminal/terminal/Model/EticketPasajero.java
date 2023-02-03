package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

public class EticketPasajero {
    /**
     * Atributos de clase EticketPasajero
     */
    private String id;
    private String date;
    private List<Pasajero> puestosBus;
/**
 * Constructor para crear un objeto EticketPasajero.
 */
    public EticketPasajero(String id, String date) {
        this.id = id;
        this.date = date;
        this.puestosBus = new ArrayList<>();
    }

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

    public List<Pasajero> getPuestosBus() {
        return puestosBus;
    }

    public void setPuestosBus(List<Pasajero> puestosBus) {
        this.puestosBus = puestosBus;
    }
}



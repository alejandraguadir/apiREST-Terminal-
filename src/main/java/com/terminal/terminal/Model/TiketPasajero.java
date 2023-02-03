package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

public class TiketPasajero {

    private String id;
    private String date;
    private List<Bus> puestosBus;

    public TiketPasajero(String id, String date, List<Bus> puestosBus) {
        this.id = id;
        this.date = date;
        this.puestosBus = new ArrayList<>();;
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

    public List<Bus> getPuestosBus() {
        return puestosBus;
    }

    public void setPuestosBus(List<Bus> puestosBus) {
        this.puestosBus = puestosBus;
    }
}



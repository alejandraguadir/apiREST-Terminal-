package com.terminal.terminal.Model;

public class Destino {
    private String lugar;
    private double costo;

    /**
     * Constructor
     */
    public Destino(String lugar, double costo) {
        this.lugar = lugar;
        this.costo = costo;
    }

    public String getLugar() {
        return lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}

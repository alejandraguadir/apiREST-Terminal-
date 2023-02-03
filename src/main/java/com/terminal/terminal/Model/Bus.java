package com.terminal.terminal.Model;

public class Bus {
    private String id;
    private String placa;
    private int capacidad;
    /**
     * Constructor
     */
    public Bus(String id, String placa, int capacidad) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void disminuirPuestos(){
        this.capacidad --;
    }
}

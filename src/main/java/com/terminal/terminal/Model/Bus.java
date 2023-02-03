package com.terminal.terminal.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un objeto Bus.
 */
public class Bus {
    /**
     * Atributos de clase Bus.
     */
    private String id;
    private String date;
    private String placa;
    private int capacidad;
    private String lugarDestino;
    private double costoViaje;

    private List<Bus> pasajeros;


    public Bus(String id, String date, String placa, int capacidad, String lugarDestino, double costoViaje) {
        this.id = id;
        this.date = date;
        this.placa = placa;
        this.capacidad = capacidad;
        this.lugarDestino = lugarDestino;
        this.costoViaje = costoViaje;
        this.pasajeros = new ArrayList<>();
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

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public double getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(double costoViaje) {
        this.costoViaje = costoViaje;
    }

    public List<Bus> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Bus> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void disminuirPuestos(){
        this.capacidad --;
    }



}

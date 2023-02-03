package com.terminal.terminal.Model;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Clase que representa un objeto Destino.
 */
public class Destino {
    /**
     * Atributos de clase Destino.
     */
    private String id;
    private LocalDate fechaDeSalida;
    private LocalTime horaSalida;
    private String lugarDestino;
    private double costoViaje;

    /**
     * Constructor para crear un objeto Destino.
     *
     * @param id identificador del destino.
     * @param fechaDeSalida fecha de salida del destino.
     * @param horaSalida hora de salida del destino.
     * @param lugarDestino lugar de destino.
     * @param costoViaje costo $ del viaje.
     */
    public Destino(String id, LocalDate fechaDeSalida, LocalTime horaSalida, String lugarDestino, double costoViaje) {
        this.id = id;
        this.fechaDeSalida = fechaDeSalida;
        this.horaSalida = horaSalida;
        this.lugarDestino = lugarDestino;
        this.costoViaje = costoViaje;
    }
    /**
     * Consultores y Modificares
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(LocalDate fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
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
}

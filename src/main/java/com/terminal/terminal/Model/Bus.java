package com.terminal.terminal.Model;

import java.time.LocalDate;
import java.time.LocalTime;
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
    private String placa;
    private int capacidad;
    private LocalDate fechaDeSalida;
    private LocalTime horaSalida;
    private String lugarDestino;
    private double costoViaje;

    private List<Pasajero> pasajeros;


    /**
     * Constructor de la clase Bus.
     *
     * @param id    Identificador único del objeto Bus.
     * @param placa Placa del objeto Bus.
     */
    public Bus(String id, String placa) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
        this.fechaDeSalida = fechaDeSalida;
        this.horaSalida = horaSalida;
        this.lugarDestino = lugarDestino;
        this.costoViaje = costoViaje;
        this.pasajeros = new ArrayList<>();
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

    public String getPlaca() {
        return placa;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
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
    //Metodo para disminuir puestos

    public void disminuirPuestos(){
        this.capacidad --;
    }
    /**
     *  Método que convierte un objeto Bus en su representación de cadena.
     *  @return La representación de cadena del objeto Bus.
     */
    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidad=" + capacidad +
                ", fechaDeSalida=" + fechaDeSalida +
                ", horaSalida=" + horaSalida +
                ", lugarDestino='" + lugarDestino + '\'' +
                ", costoViaje=" + costoViaje +
                ", pasajeros=" + pasajeros +
                '}';
    }

    public void setPasajeros(List<Bus> pasajerosRegistrados) {
    }
}

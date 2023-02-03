package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Pasajero;

import java.util.List;

public interface IPasajero {
    /**
     * Métodos para implementar en la clase PasajeroService.
     */
    List<Pasajero> obtenerPasajeros();
    Pasajero agregarPasajero(Pasajero pasajero);

    void eliminarPasajero(String id);






}

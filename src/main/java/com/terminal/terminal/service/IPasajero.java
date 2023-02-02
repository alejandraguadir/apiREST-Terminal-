package com.terminal.terminal.service;

import com.terminal.terminal.Model.Pasajero;

import java.util.List;

public interface IPasajero {

    List<Pasajero> obtenerPasajeros();
    Pasajero agregarPasajero(Pasajero pasajero);
}

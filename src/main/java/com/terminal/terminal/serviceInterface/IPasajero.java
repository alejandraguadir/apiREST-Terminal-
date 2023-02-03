package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.TiketPasajero;

import java.util.List;

public interface IPasajero {

    List<Pasajero> obtenerPasajeros();
    Pasajero agregarPasajero(Pasajero pasajero);

    void eliminarPasajero(String id);






}

package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;

import java.util.List;

public interface IBus {

    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);
    void eliminarBus(String id);

    void registrarPasajerosEnBus(List<Bus> pasajerosRegistrados);


}

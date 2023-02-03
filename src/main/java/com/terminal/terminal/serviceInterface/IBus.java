package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;

import java.util.List;

public interface IBus {
/**
 * Métodos para implementar el la clase BusService.
 */
    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);
    void eliminarBus(String id);




}

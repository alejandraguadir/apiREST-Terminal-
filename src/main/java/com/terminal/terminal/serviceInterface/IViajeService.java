package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;

import java.util.List;

public interface IViajeService {

    //void registrarViaje(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado, List<Pasajero> pasajerosRegistrados);
    void registrarDestinoDeBus(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado);
    void registrarPasajeroEnBus(List<Bus> busSeleccionado,  List<Pasajero> pasajerosRegistrados);


}

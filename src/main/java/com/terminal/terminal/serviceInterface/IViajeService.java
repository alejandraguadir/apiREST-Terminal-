package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.Viaje;

import java.util.List;

public interface IViajeService {

    //void registrarViaje(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado, List<Pasajero> pasajerosRegistrados);
    //void registrarViaje(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado);

    List<Viaje> obtenerViajes();


}

package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.EticketPasajero;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.Viaje;

import java.util.List;

public interface IViajeService {

    void registrarViaje(List<Bus> registroBusParaViajar);

    List<Viaje> obtenerViajes();

    void registrarPasajero(List<Pasajero> registroPasajeroEnBus);

    List<EticketPasajero> pasajerosParaViajar();










}

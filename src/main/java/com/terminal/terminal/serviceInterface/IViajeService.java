package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.Viaje;

import java.util.List;

public interface IViajeService {

    void registrarViaje(List<Pasajero> registroPasajeros);

    List<Viaje> obtenerViajes();








}

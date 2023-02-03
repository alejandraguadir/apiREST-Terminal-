package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.Viaje;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.Repository.ViajeRepository;
import com.terminal.terminal.serviceInterface.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ViajeService implements IViajeService {
    @Autowired
    private ViajeRepository viajeRepository;

    @Autowired
    private TerminalRepository terminalRepository;

    /**
     * Metodo para registrar viaje
     *     @Override
     *     public void registrarViaje(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado, List<Pasajero> pasajerosRegistrados) {
     *
     *         Viaje nuevoViaje = new Viaje(UUID.randomUUID().toString(), new Date().toString());
     *         nuevoViaje.getBuses(busSeleccionado).stream().forEach(bus -> {
     *                 terminalRepository.asignaPasajerosABus(bus.getId());
     *         });
     *         nuevoViaje.setDestinos(destinoSeleccionado);
     *         nuevoViaje.getPasajeros(pasajerosRegistrados);
     *     }
     */

    //Registrar el bus en un destino
    @Override
    public void registrarDestinoDeBus(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado) {
        Viaje nuevoViaje = new Viaje(UUID.randomUUID().toString(),new Date().toString());
        nuevoViaje.getBuses(busSeleccionado).stream().forEach(bus -> {
            terminalRepository.asignarDestidoDeBus(bus.getId());
        });
        viajeRepository.registrarViaje(nuevoViaje);

    }

    @Override
    public void registrarPasajeroEnBus(List<Bus> busSeleccionado, List<Pasajero> pasajerosRegistrados) {

    }
}

package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Viaje;
import com.terminal.terminal.Repository.BusRepository;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.Repository.ViajeRepository;
import com.terminal.terminal.serviceInterface.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Clase de servicio para manejar la lógica de negocios relacionada con objetos de tipo Viaje.
 * Actúa como intermediario entre la lógica de la aplicación y el repositorio (capa de datos).
 */
@Service
public class ViajeService implements IViajeService {
    /**
     * Acceder a los métodos de repositorio para realizar operaciones de CRUD en la base de datos.
     **/
    @Autowired
    private BusRepository busRepository;

    @Autowired
    private TerminalRepository terminalRepository;

      // Método para obtener la lista de viajes registrados.

    @Override
    public void registrarPasajerosEnBus(List<Bus> pasajeros) {
    Bus registroPasajero = new Bus(UUID.randomUUID().toString());
        registroPasajero.setPasajeros(pasajeros);
        pasajeros.stream().forEach(puesto ->{
            terminalRepository.disminuirCapacidad(puesto.getId());
        });
        busRepository.registrarPasajeroEnBus(registroPasajero);


    }


}

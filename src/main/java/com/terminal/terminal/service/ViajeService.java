package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.EticketPasajero;
import com.terminal.terminal.Model.Viaje;
import com.terminal.terminal.Repository.BusRepository;
import com.terminal.terminal.Repository.ETicketPasajeroRepository;
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

    @Autowired
    private ViajeRepository viajeRepository;

    @Autowired
    private ETicketPasajeroRepository eTicketRepository;



    @Override
    public void registrarViaje(List<Bus> registroBusParaViajar) {
        Viaje nuevoViaje = new Viaje(UUID.randomUUID().toString(), new Date().toString(), new String());
        nuevoViaje.setBuses(registroBusParaViajar);
        viajeRepository.registrarViaje(nuevoViaje);

    }

    // Método para obtener la lista de viajes registrados.
    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepository.obtenerViajes();
    }

    @Override
    public void registrarPasajero(List<Pasajero> registroPasajeroEnBus) {
        EticketPasajero nuevoRegistroPasajero = new EticketPasajero(UUID.randomUUID().toString(), new Date().toString());
        nuevoRegistroPasajero.setPuestosBus(registroPasajeroEnBus);
        registroPasajeroEnBus.stream().forEach(puesto ->{
            terminalRepository.disminuirCapacidad(puesto.getId());

        });
        eTicketRepository.registrarTiket(nuevoRegistroPasajero);


    }


}

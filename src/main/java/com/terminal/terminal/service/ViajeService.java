package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Viaje;
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
     *
     @Override
     public void registrarPasajeroEnBus(List<Bus> busSeleccionado, List<Pasajero> pasajerosRegistrados) {
     //// Método para registrar un viaje
     @Override
     public void registrarViaje(List<Bus> busSeleccionado, List<Destino> destinoSeleccionado) {
     //Crea un nuevo viaje con un identificador único generado por UUID.
     Viaje nuevoViaje = new Viaje(UUID.randomUUID().toString(),new Date().toString());
     //Asigna el destino a cada uno de los buses seleccionados.
     nuevoViaje.getBuses(busSeleccionado).stream().forEach(bus -> {
     terminalRepository.asignarDestinoDeBus(bus.getId());
     });
     //Registra el viaje en el repositorio.
     viajeRepository.registrarViaje(nuevoViaje);

     }
     }
     */



    // Método para obtener la lista de viajes registrados.
    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepository.obtenerViajes();
    }

}

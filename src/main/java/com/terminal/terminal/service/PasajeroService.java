package com.terminal.terminal.service;

import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.Repository.ETicketPasajeroRepository;
import com.terminal.terminal.serviceInterface.IPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Clase de servicio para manejar la lógica de negocios relacionada con objetos de tipo Pasajero.
 * Actúa como intermediario entre la lógica de la aplicación y el repositorio (capa de datos).
 */
@Service
public class PasajeroService implements IPasajero {
    /**
     * Acceder a los métodos de repositorio para realizar operaciones de CRUD en la base de datos.
     **/
    @Autowired
    private TerminalRepository terminalRepository;

    @Autowired
    private ETicketPasajeroRepository tiketPasajeroRepository;



    //Devuelve una lista de pasajeros almacenados en el repositorio de
    // terminales utilizando el método mostrarPasajeros().
    @Override
    public List<Pasajero> obtenerPasajeros() {
        return terminalRepository.mostrarPasajeros();
    }

    //agrega un pasajero nuevo al repositorio de terminales utilizando el método agregarPasajero(Pasajero pasajero).
    @Override
    public Pasajero agregarPasajero(Pasajero pasajero) {
        Pasajero addPasajero = new Pasajero(UUID.randomUUID().toString(),
                pasajero.getNombre(),
                pasajero.getApellido());
        terminalRepository.agregarPasajero(addPasajero);
        return addPasajero;
    }

    //Elimina un pasajero del repositorio de terminales utilizando el método eliminarPasajero(String id).
    @Override
    public void eliminarPasajero(String id) {
        terminalRepository.eliminarPasajero(id);
        //terminalRepository.mostrarPasajeros().removeIf(p -> p.getId().equals(id));
    }





}

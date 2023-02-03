package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Repository.BusRepository;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.serviceInterface.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Clase de servicio para manejar la lógica de negocios relacionada con objetos de tipo Bus.
 * Actúa como intermediario entre la lógica de la aplicación y el repositorio (capa de datos).
 */
@Service
public class BusService implements IBus {

    /**
     * Acceder a los métodos de repositorio para realizar operaciones de CRUD en la base de datos.
     **/
    @Autowired
    private TerminalRepository terminalRepository;

    @Autowired
    private BusRepository busRepository;

    //Devuelve una lista de objetos de tipo Bus desde el repositorio.
    @Override
    public List<Bus> obtenerBuses() {
        return terminalRepository.mostrarBuses();
    }

    //Agrega un nuevo objeto de tipo Bus al repositorio, generando un identificador
    // único para este objeto mediante la clase UUID.



    @Override
    public Bus agregarBus(Bus bus) {
        Bus addBus = new Bus(UUID.randomUUID().toString(), new Date().toString(),
                bus.getPlaca(),
                bus.getCapacidad(),
                bus.getLugarDestino(),
                bus.getCostoViaje());
        terminalRepository.agregarBus(addBus);
        return addBus;


    }

    //Elimina un objeto de tipo Bus del repositorio, dado su identificador.
    @Override
    public void eliminarBus(String id) {
        terminalRepository.eliminarBus(id);
    }


}

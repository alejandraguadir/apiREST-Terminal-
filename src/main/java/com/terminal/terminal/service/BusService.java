package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BusService implements IBus {

    @Autowired
    private TerminalRepository terminalRepository;

    //Metodo para obtener buses
    @Override
    public List<Bus> obtenerBuses() {
        return terminalRepository.mostrarBuses();
    }

    //Metodo para agregar buses
    @Override
    public Bus agregarBus(Bus bus) {
        Bus addBus = new Bus(UUID.randomUUID().toString(),
                bus.getPlaca(),
                bus.getCapacidad());
        terminalRepository.agregarBus(addBus);
        return addBus;


    }

    @Override
    public void eliminarBus(String id) {
        terminalRepository.eliminarBus(id);
    }
}

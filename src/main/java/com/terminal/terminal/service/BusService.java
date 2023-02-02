package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class BusService implements IBus {

    @Autowired
    private TerminalRepository terminalRepository;
    @Override
    public List<Bus> obtenerBuses() {
        return terminalRepository.mostrarBuses();
    }

    @Override
    public Bus agregarBus(Bus bus) {
        Bus addBus = new Bus(UUID.randomUUID().toString(),
                bus.getPlaca(),
                bus.getCapacidad());
        terminalRepository.agregarBus(addBus);
        return addBus;


    }
}

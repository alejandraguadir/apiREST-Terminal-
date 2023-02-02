package com.terminal.terminal.service;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBus {

    @Autowired
    private TerminalRepository terminalRepository;
    @Override
    public List<Bus> obtenerBuses() {
        return terminalRepository.mostrarBuses();
    }
}

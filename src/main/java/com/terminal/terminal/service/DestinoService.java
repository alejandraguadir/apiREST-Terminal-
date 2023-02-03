package com.terminal.terminal.service;

import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.serviceInterface.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService implements IDestino {

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public List<Destino> obtenerDestinos() {
        return null;
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        return null;
    }

    @Override
    public void actualizarDestino(String id) {

    }

    @Override
    public void eliminarDestino(String id) {

    }
}

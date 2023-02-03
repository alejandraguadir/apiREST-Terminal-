package com.terminal.terminal.service;

import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.serviceInterface.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DestinoService implements IDestino {

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public List<Destino> obtenerDestinos() {
        return terminalRepository.mostrarDestinos();
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        Destino addDestino = new Destino(UUID.randomUUID().toString(),
                destino.getFechaDeSalida(),
                destino.getHoraSalida(),
                destino.getLugarDestino(),
                destino.getCostoViaje());
        terminalRepository.agregarDestino(addDestino);

        return addDestino;
    }

    @Override
    public void actualizarDestino(Destino destino) {

    }

    @Override
    public void eliminarDestino(String id) {
        terminalRepository.eliminarDestino(id);
    }
}

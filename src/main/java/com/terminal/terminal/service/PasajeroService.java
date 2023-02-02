package com.terminal.terminal.service;

import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PasajeroService implements IPasajero {
    @Autowired
    private TerminalRepository terminalRepository;


    //Metodo para obtener pasajeros
    @Override
    public List<Pasajero> obtenerPasajeros() {
        return terminalRepository.mostrarPasajeros();
    }

    //Metodo para agregar pasajeros
    @Override
    public Pasajero agregarPasajero(Pasajero pasajero) {
        Pasajero addPasajero = new Pasajero(UUID.randomUUID().toString(),
                pasajero.getNombre(),
                pasajero.getApellido());
        terminalRepository.agregarPasajero(addPasajero);
        return addPasajero;
    }

    @Override
    public void eliminarPasajero(String id) {
        terminalRepository.mostrarPasajeros().removeIf(p -> p.getId().equals(id));
    }



}

package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {
    private List<Bus> busConPasajeros;

    public BusRepository() {
        this.busConPasajeros = new ArrayList<>();
    }

    public List<Bus> obtenerBuses(){
        return this.busConPasajeros;
    }

    public void registrarPasajeroEnBus(Bus busConPasajero){
        busConPasajeros.add(busConPasajero);
    }
}

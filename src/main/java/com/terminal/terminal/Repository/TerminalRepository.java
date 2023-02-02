package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;

import java.util.ArrayList;
import java.util.List;

public class TerminalRepository {
    private final String nombre;
    private List<Bus> buses;
    private List<Destino> destinos;
    private List<Pasajero> pasajeros;

    public TerminalRepository() {
        this.nombre = "Terminal Capital";
        buses = new ArrayList<>(List.of(new Bus("1","456A",23)));

        destinos = new ArrayList<>(List.of(new Destino("Bogotá", 3456.2)));

        pasajeros = new ArrayList<>(List.of(new Pasajero("p1","Ana", "Rivera")));
    }

    @Override
    public String toString() {
        return "TerminalRepository{" +
                "nombre='" + nombre + '\'' +
                ", buses=" + buses +
                ", destinos=" + destinos +
                ", pasajeros=" + pasajeros +
                '}';
    }

    public void asignaDestinoDeViaje(){

    }

    public void asignaBusParaDestino(){

    }

    public void asignaPasajerosABus(){

    }
}

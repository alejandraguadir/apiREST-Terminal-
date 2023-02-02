package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TerminalRepository {
    private final String nombre;
    private List<Bus> buses;
    private List<Destino> destinos;
    private List<Pasajero> pasajeros;

    public TerminalRepository() {
        this.nombre = "Terminal Capital";
        buses = new ArrayList<>(List.of(new Bus("1","456A",23)));

        destinos = new ArrayList<>(List.of(new Destino("Bogotá", 3456.2),
                new Destino("Popayan", 50000.2),
                new Destino("Tunja", 50000.2),
                new Destino("Cali", 50000.2),
                new Destino("Cartagena", 90000.2)));

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
    //Metodo para mostrar buses disponibles
    public List<Bus> mostrarBuses(){
        return buses;
    }

    //Metodo para Crear buses
    public void agregarBus(Bus bus){buses.add(bus);}

    //Metodo para mostrar  pasajeros
    public List<Pasajero> mostrarPasajeros(){
        return pasajeros;
    }

    //Metodo para crear pasajeros
    public void agregarPasajero(Pasajero pasajero){pasajeros.add(pasajero);}

}

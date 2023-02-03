package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TerminalRepository {
    /**
     * Atributos
     */
    private final String nombre;
    private List<Bus> buses;
    private List<Destino> destinos;
    private List<Pasajero> pasajeros;

    /**
     * Constructor
     */
    public TerminalRepository() {
        this.nombre = "Terminal Capital";
        buses = new ArrayList<>(List.of(new Bus("1", "456A", 23)));

        destinos = new ArrayList<>(List.of(new Destino("v1", LocalDate.of(2023, 2, 11), LocalTime.of(9, 30), "Bogotá", 855000.0)));

        pasajeros = new ArrayList<>(List.of(new Pasajero("p1", "Ana", "Rivera")));
    }

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "TerminalRepository{" +
                "nombre='" + nombre + '\'' +
                ", buses=" + buses +
                ", destinos=" + destinos +
                ", pasajeros=" + pasajeros +
                '}';
    }

    /**
     * Metodos  para la implementación de la logica de negocio en el terminal.
     */

    //Metodo para mostrar destinos disponibles
    public List<Destino> mostrarDestinos() {
        return destinos;
    }

    //Metodo para Crear destinos
    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }

    /**
     *   Metodo para actualizar destino
     *     public List<Destino> actualizarDestino(String id){
     *
     *         List<Destino> newDestino = destinos.stream().map(d -> d.getId().equals(id) ? destinos : d).collect(Collectors.toList());
     *         this.destinos = newDestino;
     *         return destinos;
     *     }
     */



    //Metodo para eliminar destino
    public void eliminarDestino(String id) {
        destinos.removeIf(destino -> destino.getId().equals(id));
    }

    //Metodo para mostrar buses disponibles
    public List<Bus> mostrarBuses() {
        return buses;
    }

    //Metodo para Crear buses
    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    //Metodo para eliminar buses
    public void eliminarBus(String id) {
        buses.removeIf(bus -> bus.getId().equals(id));
    }

    //Metodo para mostrar  pasajeros
    public List<Pasajero> mostrarPasajeros() {
        return pasajeros;
    }

    //Metodo para crear pasajeros
    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    //Metodo para eliminar pasajeros
    public void eliminarPasajero(String id) {
        pasajeros.removeIf(pasajero -> pasajero.getId().equals(id));
    }

    public void asignaDestinoDeViaje() {

    }

    public void asignaBusParaDestino() {

    }


    public void asignaPasajerosABus(String id) {
        List<Bus> pasajerosIncritos = buses.stream().map(bus -> {
            if (bus.getId().equals(id)) {
                bus.disminuirPuestos();
                return bus;
            }
            return bus;
        }).collect(Collectors.toList());

    }

    //Metodo para asignar destino a bus
    public void asignarDestidoDeBus(String id) {
        List<Bus> busParaViajar = buses.stream().map(bus -> {
            if (bus.getId().equals(id)) {
                return bus;
            }
            return bus;
        }).collect(Collectors.toList());


    }

}

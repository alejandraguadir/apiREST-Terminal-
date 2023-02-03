package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase TerminalRepository es un repositorio que se encarga de almacenar y gestionar la lógica relacionada con Terminal Capital.
 * Se utiliza la anotación @Repository para identificarlo como un componente de la capa de persistencia de datos.
 */
@Repository
public class TerminalRepository {
    /**
     * Atributos clase TerminalRepository
     */
    private final String nombre;
    private List<Bus> buses;
    private List<Pasajero> pasajeros;

    /**
     * Crea un objeto TerminalRepository con valores predeterminados o enviados en formato JSON,
     * para los campos nombre, buses, destinos y pasajeros.
     */
    public TerminalRepository() {
        this.nombre = "Terminal Capital";
        buses = new ArrayList<>(List.of(new Bus("b1", "34bv", 34, "Cali", 90000.0)));

        pasajeros = new ArrayList<>(List.of(new Pasajero("p1", "Ana", "Rivera")));
    }

    @Override
    public String toString() {
        return "TerminalRepository{" +
                "nombre='" + nombre + '\'' +
                ", buses=" + buses +
                ", pasajeros=" + pasajeros +
                '}';
    }

    /**
     * Devuelve una representación en forma de cadena de texto de un objeto TerminalRepository.
     *
     * @return representación en forma de cadena de texto del objeto TerminalRepository.
     */


    //Devuelve la lista con los buses registrados.
    public List<Bus> mostrarBuses() {
        return buses;
    }

    //Método para agregar un bus a la lista de buses en TerminalRepository.
    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    //Método para eliminar un bus de la lista de buses en TerminalRepository.
    //@param id identificador único del bus a ser eliminado de la lista de buses.
    public void eliminarBus(String id) {
        buses.removeIf(bus -> bus.getId().equals(id));
    }

    //Devuelve la lista con los pasajerosRegistrados
    public List<Pasajero> mostrarPasajeros() {
        return pasajeros;
    }

    //Método para agregar un pasajero a la lista de pasajeros en TerminalRepository.
    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    //Método para eliminar un pasajero de la lista de pasajeros en TerminalRepository.
    //@param id identificador único del pasajero a ser eliminado de la lista de pasajeros.
    public void eliminarPasajero(String id) {
        pasajeros.removeIf(pasajero -> pasajero.getId().equals(id));
    }





    public void disminuirCapacidad(String id) {
        List<Bus> resultado = buses.stream().map(puesto -> {
            if (puesto.getId().equals(id)) {
                puesto.disminuirPuestos();
                return puesto;
            }
            return puesto;
        }).collect(Collectors.toList());
    }

}

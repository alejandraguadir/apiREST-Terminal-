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
/**
 La clase TerminalRepository es un repositorio que se encarga de almacenar y gestionar la lógica relacionada con Terminal Capital.
 Se utiliza la anotación @Repository para identificarlo como un componente de la capa de persistencia de datos.
 */
@Repository
public class TerminalRepository {
    /**
     * Atributos clase TerminalRepository
     */
    private final String nombre;
    private List<Bus> buses;
    private List<Destino> destinos;
    private List<Pasajero> pasajeros;

    /**
     * Crea un objeto TerminalRepository con valores predeterminados o enviados en formato JSON,
     * para los campos nombre, buses, destinos y pasajeros.
     */
    public TerminalRepository() {
        this.nombre = "Terminal Capital";
        buses = new ArrayList<>(List.of(new Bus("b1", "34bv")));

        destinos = new ArrayList<>(List.of(new Destino("v1", LocalDate.of(2023, 2, 11), LocalTime.of(9, 30), "Bogotá", 855000.0)));

        pasajeros = new ArrayList<>(List.of(new Pasajero("p1", "Ana", "Rivera")));
    }

    /**
     * Devuelve una representación en forma de cadena de texto de un objeto TerminalRepository.
     *
     * @return representación en forma de cadena de texto del objeto TerminalRepository.
     */

    @Override
    public String toString() {
        return "TerminalRepository{" + "nombre='" + nombre + '\'' + ", buses=" + buses + ", destinos=" + destinos + ", pasajeros=" + pasajeros + '}';
    }


    //Devuelve la lista con los destinos.
    public List<Destino> mostrarDestinos() {
        return destinos;
    }

    //Método para agregar un destino a la lista de destinos en TerminalRepository.
    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }

    /**
     * // Actualiza un objeto de la clase Destino que ya existe en la
     * //lista de destinos de la clase TerminalRepository.
     * public List<Destino> actualizarDestino(String id){
     * <p>
     * List<Destino> newDestino = destinos.stream().map(d -> d.getId().equals(id) ? destinos : d).collect(Collectors.toList());
     * this.destinos = newDestino;
     * return destinos;
     * }
     */


    //Método para eliminar un destino de la lista de destinos en TerminalRepository.
    //@param id identificador único del destino a ser eliminado de la lista de destinos.
    public void eliminarDestino(String id) {
        destinos.removeIf(destino -> destino.getId().equals(id));
    }

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

    //Asigna un pasajero a un bus específico según el identificador enviado.
    //@param id Identificador del bus al que se le asignará un pasajero.
    public void asignaPasajerosABus(String id) {
        // Se utiliza el método stream de Java para filtrar el bus específico por su identificador y disminuir su número de puestos disponibles.
        List<Bus> pasajerosIncritos = buses.stream().map(bus -> {
            if (bus.getId().equals(id)) {
                bus.disminuirPuestos();
                return bus;
            }
            return bus;
        }).collect(Collectors.toList());

    }

    //Asigna un destino a un autobús específico basándose en su ID.
    //@param id El ID del autobús para el que se desea asignar el destino.
    public void asignarDestinoDeBus(String id) {
        List<Bus> busParaViajar = buses.stream().map(bus -> {
            if (bus.getId().equals(id)) {
                return bus;
            }
            return bus;
        }).collect(Collectors.toList());


    }

    public void disminuirCapacidad(String id){
        List<Bus> resultado = buses.stream().map(puesto -> {
            if(puesto.getId().equals(id)){
                puesto.disminuirPuestos();
                return puesto;
            }
            return puesto;
        }).collect(Collectors.toList());
    }

}

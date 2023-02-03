package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase BusRepository es un repositorio que se encarga de almacenar y gestionar la lógica relacionada con la asignación de buses a vajes.
 * Se utiliza la anotación @Repository para identificarlo como un componente de la capa de persistencia de datos.
 */
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

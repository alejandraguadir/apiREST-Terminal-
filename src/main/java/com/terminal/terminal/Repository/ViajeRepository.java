package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 La clase ViajeRepository es un repositorio que se encarga de almacenar y gestionar los objetos de tipo Viaje.
 Se utiliza la anotación @Repository para identificarlo como un componente de la capa de persistencia de datos.
 */
@Repository
public class ViajeRepository {

    /**
     Atributo que almacena una lista de objetos Viaje.
     */
    private List<Viaje> viajes;

    /**
     Constructor que inicializa la lista de viajes vacía.
     */
    public ViajeRepository()
    { this.viajes = new ArrayList<>();
    }

    /**
     Método que devuelve la lista de viajes almacenados en el repositorio.
     @return lista de objetos Viaje.
     */
    public List<Viaje> obtenerViajes(){return  this.viajes;}

    /**
     Método que permite registrar un nuevo viaje en el repositorio.
     @param viaje objeto Viaje a registrar.
     */
    public void registrarViaje(Viaje viaje){viajes.add(viaje);}

}

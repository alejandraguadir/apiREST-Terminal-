package com.terminal.terminal.service;

import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Repository.TerminalRepository;
import com.terminal.terminal.serviceInterface.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Clase de servicio para manejar la lógica de negocios relacionada con objetos de tipo Destino.
 * Actúa como intermediario entre la lógica de la aplicación y el repositorio (capa de datos).
 */
@Service
public class DestinoService implements IDestino {

    /**
     * Acceder a los métodos de repositorio para realizar operaciones de CRUD en la base de datos.
     **/
    @Autowired
    private TerminalRepository terminalRepository;

    //Método para obtener los destinos disponibles.
    // @return Devuelve una lista de objetos Destino.
    @Override
    public List<Destino> obtenerDestinos() {
        return terminalRepository.mostrarDestinos();
    }


    //Método para agregar un destino a la lista de destinos.
    //@return destino recién agregado a la lista de destinos.
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

    //Método para actualizar un destino
    @Override
    public void actualizarDestino(Destino destino) {
        //Código para actualizar el destino
    }

    //Método para eliminar un destino
    @Override
    public void eliminarDestino(String id) {
        terminalRepository.eliminarDestino(id);
    }
}

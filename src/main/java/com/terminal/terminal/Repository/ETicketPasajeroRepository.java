package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.EticketPasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase ETicketPasajeroRepository es un repositorio que se encarga de almacenar y gestionar la lógica relacionada con ETickets de PasajeroRepository.
 * Se utiliza la anotación @Repository para identificarlo como un componente de la capa de persistencia de datos.
 */
@Repository
public class ETicketPasajeroRepository {
    private List<EticketPasajero> tiketPasajeros;

    public ETicketPasajeroRepository(){
        this.tiketPasajeros = new ArrayList<>();

    }

    public List<EticketPasajero> obtenerTiketPasajeros(){
        return this.tiketPasajeros;
    }

    public void registrarTiket(EticketPasajero tiketPasajero){
        tiketPasajeros.add(tiketPasajero);
    }
}

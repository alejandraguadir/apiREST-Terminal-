package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.EticketPasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
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

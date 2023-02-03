package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.TiketPasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TiketPasajeroRepository {
    private List<TiketPasajero> tiketPasajeros;

    public TiketPasajeroRepository(){
        this.tiketPasajeros = new ArrayList<>();

    }

    public List<TiketPasajero> obtenerTiketPasajeros(){
        return this.tiketPasajeros;
    }

    public void registrarTiket(TiketPasajero tiketPasajero){
        tiketPasajeros.add(tiketPasajero);
    }
}

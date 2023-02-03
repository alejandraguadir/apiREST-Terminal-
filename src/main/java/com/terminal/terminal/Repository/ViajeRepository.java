package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ViajeRepository {

    private List<Viaje> viajes;
    public ViajeRepository()
    { this.viajes = new ArrayList<>();
    }

    public List<Viaje> obtenerViajes(){return  this.viajes;}

    public void registrarViaje(Viaje viaje){viajes.add(viaje);}

}

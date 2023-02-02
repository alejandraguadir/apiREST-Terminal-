package com.terminal.terminal.Repository;

import com.terminal.terminal.Model.Viaje;

import java.util.ArrayList;
import java.util.List;

public class ViajeRepository {

    private List<Viaje> viajes;
    public ViajeRepository()
    { this.viajes = new ArrayList<>();
    }

    public List<Viaje> obtenerViajes(){return  this.viajes;}

    public void registrarViajes(Viaje viaje){viajes.add(viaje);}

}

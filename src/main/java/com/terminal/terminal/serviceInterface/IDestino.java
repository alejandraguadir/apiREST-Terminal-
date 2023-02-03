package com.terminal.terminal.serviceInterface;

import com.terminal.terminal.Model.Destino;
import java.util.List;

public interface IDestino {
    List<Destino> obtenerDestinos();
    Destino agregarDestino(Destino destino);
    void actualizarDestino(Destino destino);
    void eliminarDestino(String id);


}

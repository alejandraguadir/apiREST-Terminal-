package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.serviceInterface.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class viajeController {
    @Autowired
    private IViajeService serviceViaje;

    @GetMapping("viajes")
    public ResponseEntity obtenerViajes(){
        return new ResponseEntity(serviceViaje.obtenerViajes(), HttpStatus.FOUND);
    }


    @PostMapping("/crearViaje")
    public ResponseEntity agregarViaje(@RequestBody List<Bus> buses, List<Destino> destinos) {
        serviceViaje.registrarDestinoDeBus(buses, destinos);
        return  new ResponseEntity(HttpStatus.CREATED);
    }

}

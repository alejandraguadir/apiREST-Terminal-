package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.Model.Viaje;
import com.terminal.terminal.serviceInterface.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase de un controlador REST
 */

@RestController
/**
 * Ruta base para las solicitudes que manejará este controlador.
 */
@RequestMapping("api/v1")
public class viajeController {
    /**
     * Inyecta una dependencia del servicio de viaje, el cual es una interfaz IViajeService.
     */
    @Autowired
    private IViajeService serviceViaje;

    @GetMapping("/viaje")
    public ResponseEntity obtenerViajes() {
        return new ResponseEntity(serviceViaje.obtenerViajes(), HttpStatus.FOUND);
    }
    @PostMapping("/crearViaje")
    public ResponseEntity agregarViaje(@RequestBody List<Bus> buses) {
        serviceViaje.registrarViaje(buses);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}


package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
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

    /**
     * Maneja una solicitud GET a la ruta "api/v1/viajes" y
     * devuelve una respuesta HTTP con el resultado del método "obtenerViajes" del servicio de viaje.
     */
    @GetMapping("viajes")
    public ResponseEntity obtenerViajes() {
        return new ResponseEntity(serviceViaje.obtenerViajes(), HttpStatus.FOUND);
    }

    /**
     * Maneja una solicitud POST a la ruta "api/v1/crearViaje" y
     * acepta un cuerpo en formato JSON con una lista de objetos "Bus" y una lista de objetos "Destino".
     @PostMapping("/crearViaje")
     public ResponseEntity agregarViaje(@RequestBody List<Bus> buses, List<Destino> destinos) {
     serviceViaje.registrarViaje(buses, destinos);
     return new ResponseEntity(HttpStatus.CREATED);
     }
     */


}

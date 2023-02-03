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

    /**
     * Maneja una solicitud GET a la ruta "api/v1/viaje" y devuelve una respuesta HTTP con el
     * resultado del método "obtenerViajes" del servicio de viaje.
     */
    @GetMapping("/viaje")
    public ResponseEntity obtenerViajes() {
        return new ResponseEntity(serviceViaje.obtenerViajes(), HttpStatus.FOUND);
    }

    /**
     * Maneja una solicitud GET a la ruta "api/v1/pasajerosParaViajar" y devuelve una respuesta HTTP con el
     * resultado del método "pasajerosParaViajar" del servicio de viaje.
     */
    @GetMapping("/pasajerosParaViajar")
    public ResponseEntity obtenerPasajerosParaViajar() {
        return new ResponseEntity(serviceViaje.pasajerosParaViajar(), HttpStatus.FOUND);
    }

    /**
     * Maneja una solicitud POST a la ruta "api/v1/crearViaje" y acepta un cuerpo en formato JSON con un objeto "Bus".
     * Llama al método "registrarBus" del servicio de viaje.
     */
    @PostMapping("/crearViaje")
    public ResponseEntity agregarViaje(@RequestBody List<Bus> buses) {
        serviceViaje.registrarViaje(buses);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * Maneja una solicitud POST a la ruta "api/v1/addPasajero" y acepta un cuerpo en formato JSON con un objeto "Pasajero".
     * Llama al método "registrarPasajero" del servicio de viaje.
     */
    @PostMapping("/addPasajero")
    public ResponseEntity registrarPasajero(@RequestBody List<Pasajero> pasajeros) {
        serviceViaje.registrarPasajero(pasajeros);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}


package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.serviceInterface.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Clase de un controlador REST
 */
@RestController
/**
 * Ruta base para las solicitudes que manejará este controlador.
 */
@RequestMapping("api/v1")
public class BusController {
    /**
     * Inyecta una dependencia del servicio de viaje, el cual es una interfaz IBus.
     */
    @Autowired
    private IBus serviceBus;

    /**
     * Maneja una solicitud GET a la ruta "api/v1/buses" y devuelve una respuesta HTTP con el
     * resultado del método "obtenerBuses" del servicio de buses.
     */
    @GetMapping("/buses")
    public ResponseEntity obtenerBuses() {
        return new ResponseEntity(serviceBus.obtenerBuses(), HttpStatus.FOUND);
    }

    /**
     * Maneja una solicitud POST a la ruta "api/v1/bus" y acepta un cuerpo en formato JSON con un objeto "Bus".
     * Llama al método "agregarBus" del servicio de buses.
     */
    @PostMapping("/bus")
    public ResponseEntity agregarBuses(@RequestBody Bus bus) {
        return new ResponseEntity(serviceBus.agregarBus(bus), HttpStatus.CREATED);
    }

    /**
     * Maneja una solicitud DELETE a la ruta "api/v1/bus/{id}" y acepta un parámetro en la ruta con nombre "id".
     * Llama al método "eliminarBus" del servicio de buses.
     */
    @DeleteMapping("/bus/{id}")
    public ResponseEntity eliminarBus(@PathVariable String id) {
        serviceBus.eliminarBus(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}

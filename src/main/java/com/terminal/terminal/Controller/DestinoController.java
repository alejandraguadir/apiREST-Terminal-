package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.serviceInterface.IBus;
import com.terminal.terminal.serviceInterface.IDestino;
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
public class DestinoController {
    /**
     * Inyecta una dependencia del servicio de viaje, el cual es una interfaz IDestino.
     */
    @Autowired
    private IDestino serviceDestino;
    /**
     * Maneja una solicitud GET a la ruta "api/v1/destinos" y devuelve una respuesta HTTP con el
     * resultado del método "obtenerDestinos" del servicio de destinos.
     */
    @GetMapping("/destinos")
    public ResponseEntity obtenerDestinos() {
        return new ResponseEntity(serviceDestino.obtenerDestinos(), HttpStatus.FOUND);
    }
    /**
     * Maneja una solicitud POST a la ruta "api/v1/destino" y acepta un cuerpo en formato JSON con un objeto "Destino".
     * Llama al método "agregarDestino" del servicio de pasajeros.
     */
    @PostMapping("/destino")
    public ResponseEntity agregarDestino(@RequestBody Destino destino) {
        return new ResponseEntity(serviceDestino.agregarDestino(destino), HttpStatus.CREATED);
    }
    /**
     * Maneja una solicitud DELETE a la ruta "api/v1/destino/{id}" y acepta un parámetro en la ruta con nombre "id".
     * Llama al método "eliminarDestino" del servicio de pasajeros.
     */
    @DeleteMapping("/destino/{id}")
    public ResponseEntity eliminarDestino(@PathVariable String id) {
        serviceDestino.eliminarDestino(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

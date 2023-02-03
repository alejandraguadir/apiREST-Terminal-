package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.serviceInterface.IPasajero;
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
public class PasajeroController {
    /**
     * Inyecta una dependencia del servicio de viaje, el cual es una interfaz IPasajero.
     */
    @Autowired
    private IPasajero servicePasajero;

    /**
     * Maneja una solicitud GET a la ruta "api/v1/pasajeros" y devuelve una respuesta HTTP con el
     * resultado del método "obtenerPasajeros" del servicio de pasajeros.
     */
    @GetMapping("/pasajeros")
    public ResponseEntity obtenerPasajeros() {
        return new ResponseEntity(servicePasajero.obtenerPasajeros(), HttpStatus.FOUND);
    }

    /**
     * Maneja una solicitud POST a la ruta "api/v1/pasajero" y acepta un cuerpo en formato JSON con un objeto "Pasajero".
     * Llama al método "agregarPasajero" del servicio de pasajeros.
     */
    @PostMapping("/pasajero")
    public ResponseEntity agregarPasajero(@RequestBody Pasajero pasajero) {
        return new ResponseEntity(servicePasajero.agregarPasajero(pasajero), HttpStatus.CREATED);
    }

    /**
     * maneja una solicitud DELETE a la ruta "api/v1/pasajero/{id}" y acepta un parámetro en la ruta con nombre "id".
     * Llama al método "eliminarPasajero" del servicio de pasajeros.
     */
    @DeleteMapping("/pasajero/{id}")
    public ResponseEntity eliminarPasajero(@PathVariable String id) {
        servicePasajero.eliminarPasajero(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}

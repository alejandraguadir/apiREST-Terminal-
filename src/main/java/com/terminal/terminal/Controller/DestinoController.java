package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Destino;
import com.terminal.terminal.serviceInterface.IBus;
import com.terminal.terminal.serviceInterface.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class DestinoController {

    @Autowired
    private IDestino serviceDestino;

    @GetMapping("/destinos")
    public ResponseEntity obtenerDestinos() {
        return new ResponseEntity(serviceDestino.obtenerDestinos(), HttpStatus.FOUND);
    }

    @PostMapping("/destino")
    public ResponseEntity agregarDestino(@RequestBody Destino destino) {
        return new ResponseEntity(serviceDestino.agregarDestino(destino), HttpStatus.CREATED);
    }

    @DeleteMapping("/destino/{id}")
    public ResponseEntity eliminarDestino(@PathVariable String id) {
        serviceDestino.eliminarDestino(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

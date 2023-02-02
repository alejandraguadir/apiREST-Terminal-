package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.Model.Pasajero;
import com.terminal.terminal.service.IPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class PasajeroController {
    @Autowired
    private IPasajero servicePasajero;

    @GetMapping("/pasajeros")
    public ResponseEntity obtenerPasajeros(){
        return new ResponseEntity(servicePasajero.obtenerPasajeros(), HttpStatus.FOUND);
    }

    @PostMapping("/pasajero")
    public ResponseEntity agregarPasajero(@RequestBody Pasajero pasajero){ return new ResponseEntity(servicePasajero.agregarPasajero(pasajero), HttpStatus.CREATED);}


}

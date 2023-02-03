package com.terminal.terminal.Controller;

import com.terminal.terminal.Model.Bus;
import com.terminal.terminal.serviceInterface.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class BusController {

    @Autowired
    private IBus serviceBus;

    @GetMapping("/buses")
    public ResponseEntity obtenerBuses(){
        return new ResponseEntity(serviceBus.obtenerBuses(), HttpStatus.FOUND);
    }

    @PostMapping("/bus")
    public ResponseEntity agregarBuses(@RequestBody Bus bus){ return new ResponseEntity(serviceBus.agregarBus(bus), HttpStatus.CREATED);}

    @DeleteMapping("/bus/{id}")
    public ResponseEntity eliminarBus(@PathVariable String id) {
        serviceBus.eliminarBus(id);
        return new ResponseEntity(HttpStatus.OK);
    }




}

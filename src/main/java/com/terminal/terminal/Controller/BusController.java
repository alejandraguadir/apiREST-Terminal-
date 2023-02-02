package com.terminal.terminal.Controller;


import com.terminal.terminal.service.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BusController {

    @Autowired
    private IBus service;

    @GetMapping()
    public ResponseEntity obtenerBuses(){
        return new ResponseEntity(service.obtenerBuses(), HttpStatus.FOUND);
    }

}

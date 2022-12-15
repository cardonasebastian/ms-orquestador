package com.example.orquestador.controller;

import com.example.orquestador.model.DataInformationResponse;
import com.example.orquestador.service.IRecuperarSuma;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ControllerSuma {

    /**
     *
     */
    private final IRecuperarSuma service;

    /**
     *
     * @param service
     */
    public ControllerSuma(IRecuperarSuma service) {
        this.service = service;
    }

    @GetMapping("/recuperar")
    public ResponseEntity<Integer> recuperar() {
        DataInformationResponse response = service.recuperarSuma();
        return new ResponseEntity<>(response.getSuma(), HttpStatus.OK);
    }
}

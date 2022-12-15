package com.example.orquestador.service.impl;

import com.example.orquestador.client.ConsumirAPI;
import com.example.orquestador.model.DataInformationRequest;
import com.example.orquestador.model.DataInformationResponse;
import com.example.orquestador.service.IRecuperarSuma;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecuperarSumaServiceImpl implements IRecuperarSuma {

    private final ConsumirAPI consumirAPI;

    @Override
    public DataInformationResponse recuperarSuma() {
        DataInformationResponse response = consumirAPI.sumar(new DataInformationRequest(5, 2));
        return response;
    }
}


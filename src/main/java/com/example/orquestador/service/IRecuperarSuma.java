package com.example.orquestador.service;


import com.example.orquestador.model.DataInformationRequest;
import com.example.orquestador.model.DataInformationResponse;

public interface IRecuperarSuma {

    /**
     * Metodo que recupera la suma de los numeros.
     *
     * @return
     */
    DataInformationResponse recuperarSuma();
}

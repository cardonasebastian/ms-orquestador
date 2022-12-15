package com.example.orquestador.client;

import com.example.orquestador.model.DataInformationRequest;
import com.example.orquestador.model.DataInformationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8080/api/v1", name = "sumar")
public interface ConsumirAPI {

    @PostMapping("/sumar")
    DataInformationResponse sumar(DataInformationRequest request);
}

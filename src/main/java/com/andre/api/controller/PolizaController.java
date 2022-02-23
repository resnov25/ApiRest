package com.andre.api.controller;

import com.andre.api.request.PolizaRequest;
import com.andre.api.service.PolizaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/polizas")
public class PolizaController {
    @Autowired
    private PolizaService polizaService;

    @PostMapping
    public void savePoliza(@RequestBody PolizaRequest polizaRequest){
        log.info("Guardando Poliza {}", polizaRequest);
        try {
            polizaService.guardarPoliza(polizaRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.andre.api.controller;

import com.andre.api.request.BeneficiarioRequest;
import com.andre.api.service.BeneficiarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/beneficiarios")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioService beneficiarioService;

    @PostMapping
    public void saveBeneficiario(@RequestBody BeneficiarioRequest beneficiarioRequest){
        log.info("Guardando Beneficiario {}", beneficiarioRequest );
        beneficiarioService.guardarBeneficiario(beneficiarioRequest);

    }
}

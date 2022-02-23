package com.andre.api.service;

import com.andre.api.po.Poliza;
import com.andre.api.repository.PolizaRepository;
import com.andre.api.request.PolizaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Slf4j
@Service
public class PolizaService {
    @Autowired
    private PolizaRepository polizaRepository;
    public void guardarPoliza(PolizaRequest polizaRequest) throws Exception {
        Optional<Poliza> sPoliza = polizaRepository.findById(polizaRequest.getNumero());
        if(sPoliza.isPresent()){
            log.error("La poliza ya extiste, no se puede guardar 2 veces");
            throw new Exception();
        }

        if(polizaRequest.getVigencia().before(new Date())){
            log.error("La fecha no es valida");
            throw new Exception();
        }
        Poliza poliza = Poliza.builder()
                .numeroPoliza(polizaRequest.getNumero())
                .fechaInicio(polizaRequest.getFechaInicio())
                .tipo(polizaRequest.getTipo())
                .vigencia(polizaRequest.getVigencia())
                .build();
        polizaRepository.save(poliza);
    }
}

package com.andre.api.service;

import com.andre.api.exception.CustomException;
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
    public Poliza guardarPoliza(PolizaRequest polizaRequest) throws CustomException {
        Optional<Poliza> sPoliza = polizaRepository.findById(polizaRequest.getNumero());
        if(sPoliza.isPresent()){
            throw new CustomException("La poliza ya extiste, no se puede guardar 2 veces");
        }

        if(polizaRequest.getVigencia().before(new Date())){
            throw new CustomException("La fecha no es valida");
        }
        Poliza poliza = Poliza.builder()
                .numeroPoliza(polizaRequest.getNumero())
                .fechaInicio(polizaRequest.getFechaInicio())
                .tipo(polizaRequest.getTipo())
                .vigencia(polizaRequest.getVigencia())
                .build();
        return polizaRepository.save(poliza);
    }
}

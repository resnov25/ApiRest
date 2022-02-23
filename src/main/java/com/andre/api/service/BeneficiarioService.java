package com.andre.api.service;

import com.andre.api.repository.BeneficiarioRepository;
import com.andre.api.request.BeneficiarioRequest;
import com.andre.api.po.Beneficiario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiarioService {
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    public void guardarBeneficiario(BeneficiarioRequest request){
      Beneficiario beneficiario = Beneficiario.builder().name(request.getName()).build();
      beneficiarioRepository.save(beneficiario);
    }
}

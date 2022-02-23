package com.andre.api.repository;

import com.andre.api.po.Beneficiario;
import com.andre.api.po.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizaRepository extends JpaRepository <Poliza, Integer>{
}

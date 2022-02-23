package com.andre.api.repository;

import com.andre.api.po.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository <Beneficiario, Integer> {

}

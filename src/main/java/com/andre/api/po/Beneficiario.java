package com.andre.api.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beneficiario {
    @Id
    @SequenceGenerator(
            name = "beneficiario_id_sequence",
            sequenceName = "beneficiario_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "beneficiario_id_sequence"
    )

    private Integer id;
    private String name;


}

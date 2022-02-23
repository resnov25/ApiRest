package com.andre.api.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Poliza {
    @Id
    private Integer numeroPoliza;
    @Column
    private Date fechaInicio;
    @Column
    private Date vigencia;
    @Column
    private Integer tipo;
}

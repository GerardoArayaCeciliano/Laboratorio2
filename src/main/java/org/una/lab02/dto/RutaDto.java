/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.dto;

import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author LordLalo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RutaDto {

    private Long id;
    private String codigo;
    private float distancia;
    private Date fechaRegistro;
    private Date fechaModificacion;
    @Setter(value = AccessLevel.NONE)
    private List<AutobusDto> autobusList;
    @Setter(value = AccessLevel.NONE)
    private CiudadDto lab2CiudadesIdOrigen;
    @Setter(value = AccessLevel.NONE)
    private CiudadDto lab2CiudadesIdDestino;
    @Setter(value = AccessLevel.NONE)
    private List<RutaCiudadDto> rutaCiudadList;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private List<AutobusDto> autobusList;
    private CiudadDto lab2CiudadesIdOrigen;
    private CiudadDto lab2CiudadesIdDestino;
    private List<RutaCiudadDto> rutaCiudadList;
}

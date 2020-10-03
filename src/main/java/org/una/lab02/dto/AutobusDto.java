/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.dto;

import java.util.Date;
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
public class AutobusDto {

    private Long id;
    private String matricula;
    private short modelo;
    private Integer capacidad;
    private String nombreConductor;
    private Date fechaRegistro;
    private Date fechaModificacion;
    @Setter(value = AccessLevel.NONE)
    private RutaDto rutas;
}

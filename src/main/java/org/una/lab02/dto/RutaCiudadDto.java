package org.una.lab02.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class RutaCiudadDto {

    private Long id;
    private Integer numeroOrden;
    private CiudadDto lab2CiudadesId;
    private RutaCiudadDto lab2RutasId;
}

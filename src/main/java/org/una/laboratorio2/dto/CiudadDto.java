/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.dto;

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
public class CiudadDto {
    private Long id;
    private String nombre;
    private String direccion;
    private String telefonoParada;
    private List<RutaDto> rutaList;
    private List<RutaDto> rutaList1;
    private List<RutaCiudadDto> rutaCiudadList;
}

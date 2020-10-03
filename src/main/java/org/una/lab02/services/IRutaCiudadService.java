/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.services;

import java.util.List;
import java.util.Optional;
import org.una.lab02.dto.RutaCiudadDto;

/**
 *
 * @author LordLalo
 */
public interface IRutaCiudadService {

    public Optional<RutaCiudadDto> getById(long id);

    public Optional<List<RutaCiudadDto>> findAll();

}

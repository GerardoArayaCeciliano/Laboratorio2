/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.services;

import java.util.List;
import java.util.Optional;
import org.una.lab02.dto.CiudadDto;

/**
 *
 * @author LordLalo
 */
public interface ICiudadService {

    public Optional<CiudadDto> getById(long id);

    public Optional<List<CiudadDto>> findAll();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.laboratorio2.dto.CiudadDto;
import org.una.laboratorio2.entities.Ciudad;
import org.una.laboratorio2.repositories.ICiudadRepository;
import org.una.laboratorio2.utils.MapperUtils;



/**
 *
 * @author LordLalo
 */
@Service
public class CiudadServiceImplementation implements ICiudadService{
  @Autowired
    private ICiudadRepository ciudadRepository;

    private Optional<List<CiudadDto>> findList(List<Ciudad> list) {
        if (list != null) {
            List<CiudadDto> autobusDto = MapperUtils.DtoListFromEntityList(list, CiudadDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }

   private Optional<List<CiudadDto>> findList(Optional<List<Ciudad>> list) {
     if (list.isPresent()) {
            return findList(list.get());
        } else {
            return null;
        }
    }

    private Optional<CiudadDto> oneToDto(Optional<Ciudad> one) {
        if (one.isPresent()) {
           CiudadDto autobusDto = MapperUtils.DtoFromEntity(one.get(), CiudadDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }
    @Override
    public Optional<CiudadDto> getById(long id) {
      return oneToDto(ciudadRepository.findById(id));
    }

    @Override
    public Optional<List<CiudadDto>> findAll() {
    return  findList(ciudadRepository.findAll());
    }

   
    
}

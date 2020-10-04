package org.una.lab02.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.lab02.dto.*;

import org.una.lab02.entities.RutaCiudad;

import org.una.lab02.repositories.IRutaCiudadRepository;

import org.una.lab02.utils.MapperUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class RutaCiudadServiceImplementation implements IRutaCiudadService{


    @Autowired
    private IRutaCiudadRepository ciudadRepository;

    private Optional<List<RutaCiudadDto>> findList(List<RutaCiudad> list) {
        if (list != null) {
            List<RutaCiudadDto> autobusDto = MapperUtils.DtoListFromEntityList(list, RutaCiudadDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }

    private Optional<List<RutaCiudadDto>> findList(Optional<List<RutaCiudad>> list) {
        if (list.isPresent()) {
            return findList(list.get());
        } else {
            return null;
        }
    }

    private Optional<RutaCiudadDto> oneToDto(Optional<RutaCiudad> one) {
        if (one.isPresent()) {
            RutaCiudadDto autobusDto = MapperUtils.DtoFromEntity(one.get(), RutaCiudadDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }
    @Override
    public Optional<RutaCiudadDto> getById(long id) {
        return oneToDto(ciudadRepository.findById(id));
    }

    @Override
    public Optional<List<RutaCiudadDto>> findAll() {
        return  findList(ciudadRepository.findAll());
    }


}

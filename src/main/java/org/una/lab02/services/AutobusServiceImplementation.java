/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.lab02.dto.AutobusDto;
import org.una.lab02.dto.CiudadDto;
import org.una.lab02.entities.Autobus;
import org.una.lab02.repositories.IAutobusRepository;
import org.una.lab02.utils.MapperUtils;
import org.una.lab02.entities.Ciudad;

/**
 *
 * @author LordLalo
 */
@Service
public class AutobusServiceImplementation implements IAutobusService {

    @Autowired
    private IAutobusRepository autobusRepository;

    private Optional<List<AutobusDto>> findList(List<Autobus> list) {
        if (list != null) {
            List<AutobusDto> autobusDto = MapperUtils.DtoListFromEntityList(list, AutobusDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }

    private Optional<List<AutobusDto>> findList(Optional<List<Autobus>> list) {
        if (list.isPresent()) {
            return findList(list.get());
        } else {
            return null;
        }
    }

    private Optional<AutobusDto> oneToDto(Optional<Autobus> one) {
        if (one.isPresent()) {
            AutobusDto autobusDto = MapperUtils.DtoFromEntity(one.get(), AutobusDto.class);
            return Optional.ofNullable(autobusDto);
        } else {
            return null;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AutobusDto> findById(long id) {
        return oneToDto(autobusRepository.findById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<AutobusDto>> findAll() {
        return findList(autobusRepository.findAll());
    }

    @Override
    public CiudadDto getPuntoPartida(long busId) {
        Optional<Ciudad> entityCiudad = autobusRepository.getPuntoPartidaById(busId);
        if (entityCiudad.isPresent()) {
            return MapperUtils.DtoFromEntity(entityCiudad.get(), CiudadDto.class);
        }
        return null;
    }

}

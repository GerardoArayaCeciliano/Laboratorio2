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
import org.springframework.transaction.annotation.Transactional;
import org.una.laboratorio2.dto.AutobusDto;
import org.una.laboratorio2.entities.Autobus;
import org.una.laboratorio2.repositories.IAutobusRepository;
import org.una.laboratorio2.utils.MapperUtils;

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

}

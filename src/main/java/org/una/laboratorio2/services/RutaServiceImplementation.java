/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.laboratorio2.entities.Ruta;
import org.una.laboratorio2.dto.RutaDto;
import org.una.laboratorio2.repositories.IRutaRepository;
import org.una.laboratorio2.utils.MapperUtils;

/**
 *
 * @author Roberth :)
 */
@Service
public class RutaServiceImplementation implements IRutaService {

    @Autowired
    private IRutaRepository rutaRepo;

    @Override
    public RutaDto findById(long id) {
        Optional<Ruta> entityRut = rutaRepo.findById(id);
        if (entityRut.isPresent()) {
            return MapperUtils.DtoFromEntity(entityRut.get(), RutaDto.class);
        }
        return null;
    }

    @Override
    public List<RutaDto> findAll() {
        List<Ruta> entityList = rutaRepo.findAll();
        if (!entityList.isEmpty()) {
            MapperUtils.DtoListFromEntityList(entityList, RutaDto.class);
        }
        return new ArrayList();
    }

    @Override
    public Integer getNumParadasByRutaId(long id) {
        Optional<Integer> result = rutaRepo.getNumParadasByRutaId(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

}

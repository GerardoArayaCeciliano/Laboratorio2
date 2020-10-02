package org.una.laboratorio2.services;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio2.dto.AutobusDto;

/**
 *
 * @author LordLalo
 */
public interface IAutobusService {

    Optional<AutobusDto> getById(long id);

    public Optional<List<AutobusDto>> findAll();

}
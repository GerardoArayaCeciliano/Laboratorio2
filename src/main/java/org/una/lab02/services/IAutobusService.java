package org.una.lab02.services;

import java.util.List;
import java.util.Optional;
import org.una.lab02.dto.AutobusDto;
import org.una.lab02.dto.CiudadDto;

/**
 *
 * @author LordLalo
 */
public interface IAutobusService {

    public Optional<AutobusDto> findById(long id);

    public Optional<List<AutobusDto>> findAll();

    public CiudadDto getPuntoPartida(long busId);

    public Optional<List<AutobusDto>> getListaDeAutobusPorCiudad(String nombreCiudad);
}

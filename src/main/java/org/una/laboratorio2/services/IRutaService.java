package org.una.laboratorio2.services;

import java.util.List;
import org.una.laboratorio2.dto.RutaDto;

/**
 *
 * @author LordLalo
 */
public interface IRutaService {

    public RutaDto findById(long id);

    public List<RutaDto> findAll();

    public Integer getNumParadasByRutaId(long id);
}

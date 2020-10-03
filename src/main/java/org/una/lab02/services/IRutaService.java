package org.una.lab02.services;

import java.util.List;
import org.una.lab02.dto.RutaDto;

/**
 *
 * @author LordLalo
 */
public interface IRutaService {

    public RutaDto findById(long id);

    public List<RutaDto> findAll();

    public Integer getNumParadasByRutaId(long id);
}

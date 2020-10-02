/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio2.entities.Ruta;

/**
 *
 * @author Roberth :)
 */
public interface IRutaRepository extends JpaRepository<Ruta, Long> {

    @Query("select count(rc) from RutaCiudad rc join rc.rutas ru where ru.id = :id")
    public Optional<Integer> getNumParadasByRutaId(@Param("id") long id);

}

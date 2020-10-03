/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.lab02.entities.Autobus;
import org.una.lab02.entities.Ciudad;

/**
 *
 * @author LordLalo
 */
public interface IAutobusRepository extends JpaRepository<Autobus, Long> {

    @Query("select ru.ciudadOrigen from Ruta ru join ru.autobusList au where au.id = :id")
    public Optional<Ciudad> getPuntoPartidaById(@Param("id") long id);
}

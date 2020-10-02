/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.laboratorio2.entities.Ruta;

/**
 *
 * @author LordLalo
 */
public interface IRutaRepository extends JpaRepository<Ruta,Long> {
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.lab02.entities.Ciudad;

/**
 *
 * @author LordLalo
 */
public interface ICiudadRepository extends JpaRepository<Ciudad,Long> {
    
}

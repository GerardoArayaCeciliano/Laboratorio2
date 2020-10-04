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
import org.una.lab02.entities.RutaCiudad;

/**
 *
 * @author LordLalo
 */
public interface IAutobusRepository extends JpaRepository<Autobus, Long> {

    @Query("select ru.ciudadOrigen from Ruta ru join ru.autobusList au where au.id = :id")
    public Optional<Ciudad> getPuntoPartidaById(@Param("id") long id);


    /*
    SELECT COUNT(lab2_ciudades_id) FROM lab2_autobuses join lab2_rutas on lab2_autobuses.lab2_rutas_id = lab2_rutas_id
join lab2_rutas_ciudades on lab2_rutas.id = lab2_rutas_ciudades.lab2_rutas_id
join lab2_ciudades on lab2_ciudades.id = lab2_rutas_ciudades.lab2_ciudades_id  where lab2_autobuses.id = 1;
     */

    /*
        @Query("select count (Ciudad.id)from Autobus join Ruta on Ruta.id =  Autobus.lab2RutasId.id " +
            "join RutaCiudad  on Ruta.id = RutaCiudad.rutas.id " +
            "join  Ciudad on Ciudad.id = RutaCiudad.lab2CiudadesId.id" +
            " where Autobus.id = :id")
     */
    //@Query("select count(rc) from RutaCiudad rc join rc.rutas ru where ru.id = :id")
    @Query("select count(a.id) from Autobus a inner join a.lab2RutasId r  inner join r.rutaCiudadList  rt inner join rt.lab2CiudadesId  where a.id = :id")
    public Optional<Integer> getNumeroCiudadesRutaAutobus(@Param("id") long id);
}

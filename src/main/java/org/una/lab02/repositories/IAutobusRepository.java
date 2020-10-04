/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.repositories;

import java.util.List;
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
    @Query("select count(a.id) from Autobus a inner join a.lab2RutasId r  inner join r.rutaCiudadList  rt inner join rt.lab2CiudadesId  where a.id = :id")
    public Optional<Integer> getNumeroCiudadesRutaAutobus(@Param("id") long id);

    @Query("select a from Autobus a join a.lab2RutasId r join r.rutaCiudadList c join c.lab2CiudadesId lc where lc.nombre=:nombreCiudad")
    public Optional<List<Autobus>> getListaDeAutobusPorCiudad(@Param("nombreCiudad") String nombreCiudad);
}

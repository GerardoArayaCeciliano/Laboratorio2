package org.una.laboratorio2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.una.laboratorio2.entities.Ciudad;
import org.una.laboratorio2.entities.Ruta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-01T19:20:20")
@StaticMetamodel(RutaCiudad.class)
public class RutaCiudad_ { 

    public static volatile SingularAttribute<RutaCiudad, Integer> numeroOrden;
    public static volatile SingularAttribute<RutaCiudad, Ciudad> lab2CiudadesId;
    public static volatile SingularAttribute<RutaCiudad, Long> id;
    public static volatile SingularAttribute<RutaCiudad, Ruta> lab2RutasId;

}
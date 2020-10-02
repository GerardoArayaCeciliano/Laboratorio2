package org.una.laboratorio2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.una.laboratorio2.entities.Autobus;
import org.una.laboratorio2.entities.Ciudad;
import org.una.laboratorio2.entities.RutaCiudad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-01T19:20:20")
@StaticMetamodel(Ruta.class)
public class Ruta_ { 

    public static volatile ListAttribute<Ruta, Autobus> autobusList;
    public static volatile SingularAttribute<Ruta, String> codigo;
    public static volatile SingularAttribute<Ruta, Date> fechaModificacion;
    public static volatile SingularAttribute<Ruta, Date> fechaRegistro;
    public static volatile SingularAttribute<Ruta, Float> distancia;
    public static volatile SingularAttribute<Ruta, Long> id;
    public static volatile SingularAttribute<Ruta, Ciudad> lab2CiudadesIdOrigen;
    public static volatile ListAttribute<Ruta, RutaCiudad> rutaCiudadList;
    public static volatile SingularAttribute<Ruta, Ciudad> lab2CiudadesIdDestino;

}
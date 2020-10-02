package org.una.laboratorio2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.una.laboratorio2.entities.Ruta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-01T19:20:20")
@StaticMetamodel(Autobus.class)
public class Autobus_ { 

    public static volatile SingularAttribute<Autobus, Date> fechaModificacion;
    public static volatile SingularAttribute<Autobus, String> nombreConductor;
    public static volatile SingularAttribute<Autobus, Date> fechaRegistro;
    public static volatile SingularAttribute<Autobus, String> matricula;
    public static volatile SingularAttribute<Autobus, Long> id;
    public static volatile SingularAttribute<Autobus, Ruta> lab2RutasId;
    public static volatile SingularAttribute<Autobus, Short> modelo;
    public static volatile SingularAttribute<Autobus, Integer> capacidad;

}
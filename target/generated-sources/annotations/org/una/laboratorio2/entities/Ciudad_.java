package org.una.laboratorio2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.una.laboratorio2.entities.Ruta;
import org.una.laboratorio2.entities.RutaCiudad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-01T19:20:20")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, String> telefonoParada;
    public static volatile ListAttribute<Ciudad, Ruta> rutaList;
    public static volatile SingularAttribute<Ciudad, String> direccion;
    public static volatile SingularAttribute<Ciudad, Long> id;
    public static volatile ListAttribute<Ciudad, RutaCiudad> rutaCiudadList;
    public static volatile SingularAttribute<Ciudad, String> nombre;
    public static volatile ListAttribute<Ciudad, Ruta> rutaList1;

}
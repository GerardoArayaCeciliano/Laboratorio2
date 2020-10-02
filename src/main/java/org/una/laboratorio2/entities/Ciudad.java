/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author LordLalo
 */
@Entity
@Table(name = "lab2_ciudades")
@XmlRootElement

public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono_parada")
    private String telefonoParada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2CiudadesIdOrigen")
    private List<Ruta> rutaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2CiudadesIdDestino")
    private List<Ruta> rutaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2CiudadesId")
    private List<RutaCiudad> rutaCiudadList;

    
}
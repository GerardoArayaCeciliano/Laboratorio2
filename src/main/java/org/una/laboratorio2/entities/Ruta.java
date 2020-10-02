/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LordLalo
 */
@Entity
@Table(name = "lab2_rutas")
@XmlRootElement

public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "distancia")
    private float distancia;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2RutasId")
    private List<Autobus> autobusList;
    @JoinColumn(name = "lab2_ciudades_id_origen", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ciudad lab2CiudadesIdOrigen;
    @JoinColumn(name = "lab2_ciudades_id_destino", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ciudad lab2CiudadesIdDestino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lab2RutasId")
    private List<RutaCiudad> rutaCiudadList;

    
}

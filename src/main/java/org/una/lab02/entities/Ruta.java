/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author LordLalo
 */
@Entity
@Table(name = "lab2_rutas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Ciudad ciudadOrigen;
    @JoinColumn(name = "lab2_ciudades_id_destino", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ciudad ciudadDestino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutas")
    private List<RutaCiudad> rutaCiudadList;
}

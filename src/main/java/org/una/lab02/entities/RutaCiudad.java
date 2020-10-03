/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author LordLalo
 */
@Entity
@Table(name = "lab2_rutas_ciudades")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RutaCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "numero_orden")
    private Integer numeroOrden;
    @JoinColumn(name = "lab2_ciudades_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ciudad lab2CiudadesId;
    @JoinColumn(name = "lab2_rutas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ruta rutas;
}

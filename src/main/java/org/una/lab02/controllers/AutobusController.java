/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.lab02.dto.AutobusDto;
import org.una.lab02.dto.CiudadDto;
import org.una.lab02.dto.RutaDto;
import org.una.lab02.services.IAutobusService;

/**
 *
 * @author Roberth :)
 */
@RestController
@RequestMapping("/autobuses")
@Api(tags = {"Autobuses"})
public class AutobusController {

    @Autowired
    private IAutobusService autobusService;

    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene un solo autobus basado en su Id", response = AutobusDto.class, tags = "Autobuses")
    public ResponseEntity<?> getById(@PathVariable(value = "id") long id) {
        try {
            Optional<AutobusDto> result = autobusService.findById(id);
            if (result.isPresent()) {
                return new ResponseEntity<>(result.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/")
    @ResponseBody
    @ApiOperation(value = "Obtiene todos los autobuses registradas.", response = AutobusDto.class, tags = "Autobuses")
    public ResponseEntity<?> getAll() {
        try {
            Optional<List<AutobusDto>> result = autobusService.findAll();
            if (result != null && result.isPresent()) {
                return new ResponseEntity<>(result.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("getPuntoPartida/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene el punto de partida de la ruta que hace el autobus especificado.", response = AutobusDto.class, tags = "Autobuses")
    public ResponseEntity<?> getPuntoPartida(@PathVariable(value = "id") long idBus) {
        try {
            CiudadDto result = autobusService.getPuntoPartida(idBus);
            if (result != null) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("getCantParadas/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene la cantidad de paradas de un autobus especificado.", response = AutobusDto.class, tags = "Autobuses")
    public Integer getCantParadasAutobus(@PathVariable(value = "id") long idBus) {
        try {
            int result = autobusService.getNumParadasById(idBus);
            return result;

        } catch (Exception ex) {
            return 0;
        }
    }


    @GetMapping("getListaDeAutobusPorCiudad/{nombreCiudad}")
    @ResponseBody
    @ApiOperation(value = "Obtiene una lista de los Autobuses que pasan por una Ciudad.", response = RutaDto.class, tags = "Autobuses")
    public ResponseEntity<?> getListaDeAutobusPorCiudad(@PathVariable(value = "nombreCiudad") String nombreCiudad) {
        try {
            Optional<List<AutobusDto>> result = autobusService.getListaDeAutobusPorCiudad(nombreCiudad);
            if (result != null && result.isPresent()) {
                return new ResponseEntity<>(result.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

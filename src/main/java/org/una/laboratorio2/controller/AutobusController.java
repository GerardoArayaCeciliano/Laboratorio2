/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.controller;

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
import org.una.laboratorio2.dto.AutobusDto;
import org.una.laboratorio2.dto.RutaDto;
import org.una.laboratorio2.services.IAutobusService;

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
    @ApiOperation(value = "Obtiene un solo autobus basado en su Id", response = RutaDto.class, tags = "Autobuses")
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
    @ApiOperation(value = "Obtiene todos los autobuses registradas.", response = RutaDto.class, tags = "Autobuses")
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

}

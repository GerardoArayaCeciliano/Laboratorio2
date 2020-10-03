/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.lab02.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.lab02.dto.RutaDto;
import org.una.lab02.services.IRutaService;

/**
 *
 * @author Roberth :)
 */
@RestController
@RequestMapping("/rutas")
@Api(tags = {"Rutas"})
public class RutaController {

    @Autowired
    private IRutaService rutaService;

    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene una sola Ruta basada en su Id", response = RutaDto.class, tags = "Rutas")
    public ResponseEntity<?> getById(@PathVariable(value = "id") long id) {
        try {
            RutaDto result = rutaService.findById(id);
            if (result != null) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/")
    @ResponseBody
    @ApiOperation(value = "Obtiene todas las rutas registradas.", response = RutaDto.class, tags = "Rutas")
    public ResponseEntity<?> getAll() {
        try {
            List<RutaDto> result = rutaService.findAll();
            if (!result.isEmpty()) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

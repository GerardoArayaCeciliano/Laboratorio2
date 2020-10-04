package org.una.lab02.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.lab02.dto.RutaCiudadDto;

import org.una.lab02.dto.RutaDto;
import org.una.lab02.services.IRutaCiudadService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/RutaCiudades")
@Api(tags = {"Rutas Ciudades"})

public class RutaCiudadController {
    @Autowired
    private IRutaCiudadService rutaCiudadService;
    
    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene un solo ruta ciudad basado en su Id", response = RutaDto.class, tags = "Rutas Ciudades")
    public ResponseEntity<?> getById(@PathVariable(value = "id") long id) {
        try {
            Optional<RutaCiudadDto> result = rutaCiudadService.getById(id);
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
    @ApiOperation(value = "Obtiene todos los Rutas Ciudades registradas.", response = RutaDto.class, tags = "Rutas Ciudades")
    public ResponseEntity<?> getAll() {
        try {
            Optional<List<RutaCiudadDto>> result = rutaCiudadService.findAll();
            if (result != null && result.isPresent()) {
                return new ResponseEntity<>(result.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

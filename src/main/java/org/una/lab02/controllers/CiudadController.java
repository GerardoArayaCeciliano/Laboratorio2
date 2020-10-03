package org.una.lab02.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.lab02.dto.CiudadDto;
import org.una.lab02.dto.RutaDto;
import org.una.lab02.services.ICiudadService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/ciudades")
@Api(tags = {"Ciudades"})
public class CiudadController {

    @Autowired
    private ICiudadService ciudadService;

    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene un solo ciudad basado en su Id", response = RutaDto.class, tags = "Ciudades")
    public ResponseEntity<?> getById(@PathVariable(value = "id") long id) {
        try {
            Optional<CiudadDto> result = ciudadService.getById(id);
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
    @ApiOperation(value = "Obtiene todos los ciudades registradas.", response = RutaDto.class, tags = "Ciudades")
    public ResponseEntity<?> getAll() {
        try {
            Optional<List<CiudadDto>> result = ciudadService.findAll();
            if (result != null && result.isPresent()) {
                return new ResponseEntity<>(result.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

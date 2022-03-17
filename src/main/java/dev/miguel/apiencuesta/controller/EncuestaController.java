package dev.miguel.apiencuesta.controller;

import dev.miguel.apiencuesta.model.Encuesta;
import dev.miguel.apiencuesta.repo.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Metodo encargado de obtener todas las encuestas que se encuentran en la BD *
 */
@CrossOrigin
@RestController
@RequestMapping("/encuestas")
public class EncuestaController {
    @Autowired
    private EncuestaRepository encuestaRepository;

    @GetMapping("")
    List<Encuesta> index(){
        return encuestaRepository.findAll();
    }

    /*
     * Metodo encargado de insertar una encuesta en la BD, siempre y cuando el email(campo clave) no exista ya en la
     * Base de datos previamente, en caso de existir devuelve nulo y en caso contrario insertar la encuesta en la BD*
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    Encuesta create(@RequestBody Encuesta encuesta){
        Boolean present = encuestaRepository
                .findById(encuesta.getEmail()).isPresent();
        if(present){
            return null;
        }
        return encuestaRepository.save(encuesta);
    }
}

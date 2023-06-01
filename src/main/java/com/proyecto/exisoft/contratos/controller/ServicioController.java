package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.cliente.*;
import com.proyecto.exisoft.contratos.caseuse.servicio.*;
import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {
    @Autowired
    private GetServicio getServicio;
    @Autowired
    private CreateServicio createServicio;
    @Autowired
    private DeleteServicio deleteServicio;
    @Autowired
    private UpdateServicio updateServicio;
    @Autowired
    private FindBySioNombre findBySioNombre;

    @GetMapping("/")
    public ResponseEntity<List<Servicio>> getAll(){
        return new ResponseEntity<>(getServicio.getAll(), HttpStatus.OK);}
    @PostMapping("/")
    ResponseEntity<Servicio> newServicio (@RequestBody Servicio newServicio){
        return new ResponseEntity<>(createServicio.create(newServicio), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteServicio (@PathVariable Integer id){
        deleteServicio.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<Servicio> updateServicio (@RequestBody Servicio newServicio, @PathVariable Integer id){
        return new ResponseEntity<>(updateServicio.udpdate(newServicio,id),HttpStatus.OK);
    }

    @GetMapping("/{sioNombre}")
    ResponseEntity<List<Servicio>> findBySioNombre (@PathVariable String sioNombre){
        return findBySioNombre.findBySioNombre(sioNombre);
    }

}

package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.tipocontratacion.*;
import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-contrataciones")
public class TipoContratacionController {
    private GetTipoContratacion getTipoContratacion;
    private CreateTipoContratacion createTipoContratacion;
    private DeleteTipoContratacion deleteTipoContratacion;
    private UpdateTipoContratacion updateTipoContratacion;
    private FindByTcnNombre findByTcnNombre;

    public TipoContratacionController(GetTipoContratacion getTipoContratacion, CreateTipoContratacion createTipoContratacion, DeleteTipoContratacion deleteTipoContratacion, UpdateTipoContratacion updateTipoContratacion, FindByTcnNombre findByTcnNombre) {
        this.getTipoContratacion = getTipoContratacion;
        this.createTipoContratacion = createTipoContratacion;
        this.deleteTipoContratacion = deleteTipoContratacion;
        this.updateTipoContratacion = updateTipoContratacion;
        this.findByTcnNombre = findByTcnNombre;
    }

    @GetMapping("/")
    List<TipoContratacion> get(){return getTipoContratacion.getAll();}
    @PostMapping("/")
    ResponseEntity<TipoContratacion> newTipoContratacion (@RequestBody TipoContratacion newTipoContratacion){
        return new ResponseEntity<>(createTipoContratacion.create(newTipoContratacion), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteTipoContratacion(@PathVariable Integer id){
        deleteTipoContratacion.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<TipoContratacion> updateTipoContratacion(@RequestBody TipoContratacion newTipoContratacion, @PathVariable Integer id){
        return new ResponseEntity<>(updateTipoContratacion.update(newTipoContratacion,id),HttpStatus.OK);
    }
    @GetMapping("/{tcnNombre}")
    ResponseEntity<List<TipoContratacion>> findByTcnNombre(Model modelo, @Param("tcnNombre") String tcnNombre){
        modelo.addAttribute("tcnNombre", tcnNombre);
        return findByTcnNombre.findByTcnNombre(tcnNombre);
    }
}

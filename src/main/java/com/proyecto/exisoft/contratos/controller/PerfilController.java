package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.perfil.*;
import com.proyecto.exisoft.contratos.entity.Perfil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfiles")
public class PerfilController {
    private GetPerfil getPerfil;
    private CreatePerfil createPerfil;
    private DeletePerfil deletePerfil;
    private UpdatePerfil updatePerfil;
    private FindByNombre findByNombre;

    public PerfilController(GetPerfil getPerfil, CreatePerfil createPerfil, DeletePerfil deletePerfil, UpdatePerfil updatePerfil, FindByNombre findByNombre) {
        this.getPerfil = getPerfil;
        this.createPerfil = createPerfil;
        this.deletePerfil = deletePerfil;
        this.updatePerfil = updatePerfil;
        this.findByNombre = findByNombre;
    }

    @GetMapping("/")
    List<Perfil> get(){return getPerfil.getAll();}
    @PostMapping("/")
    ResponseEntity<Perfil> newPerfil (@RequestBody Perfil newPerfil){
        return new ResponseEntity<>(createPerfil.create(newPerfil), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deletePerfil(@PathVariable Integer id){
        deletePerfil.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<Perfil> updateSeniority(@RequestBody Perfil newPerfil, @PathVariable Integer id){
        return new ResponseEntity<>(updatePerfil.udpdate(newPerfil,id),HttpStatus.OK);
    }

    @GetMapping("/{pilNombre}")
    ResponseEntity<List<Perfil>> findByPilNombre (@PathVariable String pilNombre){
      return findByNombre.findByPilNombre(pilNombre);
    }
}

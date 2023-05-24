package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.profesional.*;
import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.entity.Seniority;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/profesionales")
public class ProfesionalController {
    private GetProfesional getProfesional;
    private CreateProfesional createProfesional;
    private DeleteProfesional deleteProfesional;
    private UpdateProfesional updateProfesional;
    private FindByPalFechaDeIngresoBetween findByPalFechaDeIngresoBetween;

    public ProfesionalController(GetProfesional getProfesional, CreateProfesional createProfesional, DeleteProfesional deleteProfesional, UpdateProfesional updateProfesional, FindByPalFechaDeIngresoBetween findByPalFechaDeIngresoBetween) {
        this.getProfesional = getProfesional;
        this.createProfesional = createProfesional;
        this.deleteProfesional = deleteProfesional;
        this.updateProfesional = updateProfesional;
        this.findByPalFechaDeIngresoBetween = findByPalFechaDeIngresoBetween;
    }

    @GetMapping("/")
    public ResponseEntity<List<Profesional>> getAllProfesionals(){
        return new ResponseEntity<>(getProfesional.getAll(), HttpStatus.OK);
    }
    @PostMapping("/")
    ResponseEntity<Profesional> newProfesional (@RequestBody Profesional newProfesional){
        return new ResponseEntity<>(createProfesional.create(newProfesional), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteProfesional(@PathVariable Integer id){
        deleteProfesional.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<Profesional> updateProfesional(@RequestBody Profesional newProfesional, @PathVariable Integer id){
        return new ResponseEntity<>(updateProfesional.update(newProfesional,id),HttpStatus.OK);
    }
    @GetMapping("/{PalFechaDeIngresoBegin}/{PalFechaDeIngresoEnd}")
    ResponseEntity<List<Profesional>> findByPalFechaDeIngresoBetween(@PathVariable LocalDate PalFechaDeIngresoBegin, @PathVariable LocalDate PalFechaDeIngresoEnd){
        return findByPalFechaDeIngresoBetween.findByPalFechaDeIngresoBetween(PalFechaDeIngresoBegin, PalFechaDeIngresoEnd);
    }
}

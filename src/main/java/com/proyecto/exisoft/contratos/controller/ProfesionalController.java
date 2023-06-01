package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.profesional.*;
import com.proyecto.exisoft.contratos.entity.Profesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
    private FindByPalNombre findByPalNombre;
    /*@Autowired
    private FindByPalMail findByPalMail;*/

    public ProfesionalController(GetProfesional getProfesional, CreateProfesional createProfesional, DeleteProfesional deleteProfesional, UpdateProfesional updateProfesional, FindByPalFechaDeIngresoBetween findByPalFechaDeIngresoBetween, FindByPalNombre findByPalNombre) {
        this.getProfesional = getProfesional;
        this.createProfesional = createProfesional;
        this.deleteProfesional = deleteProfesional;
        this.updateProfesional = updateProfesional;
        this.findByPalFechaDeIngresoBetween = findByPalFechaDeIngresoBetween;
        this.findByPalNombre = findByPalNombre;
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
    @GetMapping
    ResponseEntity<List<Profesional>> findByPalFechaDeIngresoBetween(
            @RequestParam("begin") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
            @RequestParam("end") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){

        return findByPalFechaDeIngresoBetween.findByPalFechaDeIngresoBetween(begin, end);
    }

    @GetMapping("/{nombre}")
    ResponseEntity<List<Profesional>> findByPalNombre (@PathVariable String nombre){
        return  findByPalNombre.findByPalNombre(nombre);
    }

   /* @GetMapping("/{mail}")
    ResponseEntity<List<Profesional>> findByPalMail (@PathVariable String mail){
        return  findByPalMail.findByPalMail(mail);
    }*/
}

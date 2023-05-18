package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.profesional.CreateProfesional;
import com.proyecto.exisoft.contratos.caseuse.profesional.DeleteProfesional;
import com.proyecto.exisoft.contratos.caseuse.profesional.GetProfesional;
import com.proyecto.exisoft.contratos.caseuse.profesional.UpdateProfesional;
import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.entity.Seniority;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profesionales")
public class ProfesionalController {
    private GetProfesional getProfesional;
    private CreateProfesional createProfesional;
    private DeleteProfesional deleteProfesional;
    private UpdateProfesional updateProfesional;

    public ProfesionalController(GetProfesional getProfesional, CreateProfesional createProfesional, DeleteProfesional deleteProfesional, UpdateProfesional updateProfesional) {
        this.getProfesional = getProfesional;
        this.createProfesional = createProfesional;
        this.deleteProfesional = deleteProfesional;
        this.updateProfesional = updateProfesional;
    }

    @GetMapping("/")
    List<Profesional> get(){return getProfesional.getAll();}
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
}

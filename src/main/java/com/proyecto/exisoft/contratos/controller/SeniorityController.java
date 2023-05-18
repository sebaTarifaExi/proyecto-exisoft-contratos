package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.seniority.CreateSeniority;
import com.proyecto.exisoft.contratos.caseuse.seniority.DeleteSeniority;
import com.proyecto.exisoft.contratos.caseuse.seniority.GetSeniority;
import com.proyecto.exisoft.contratos.caseuse.seniority.UpdateSeniority;
import com.proyecto.exisoft.contratos.entity.Seniority;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/seniorities")
public class SeniorityController {

    private GetSeniority getSeniority;
    private CreateSeniority createSeniority;
    private DeleteSeniority deleteSeniority;
    private UpdateSeniority updateSeniority;

    public SeniorityController(GetSeniority getSeniority, CreateSeniority createSeniority, DeleteSeniority deleteSeniority, UpdateSeniority updateSeniority) {
        this.getSeniority = getSeniority;
        this.createSeniority = createSeniority;
        this.deleteSeniority = deleteSeniority;
        this.updateSeniority = updateSeniority;
    }
    @GetMapping("/")
    List<Seniority> get(){return getSeniority.getAll();}
    @PostMapping("/")
    ResponseEntity<Seniority> newSeniority (@RequestBody Seniority newSeniority){
        return new ResponseEntity<>(createSeniority.create(newSeniority), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteSeniority(@PathVariable Integer id){
        deleteSeniority.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<Seniority> updateSeniority(@RequestBody Seniority newSeniority, @PathVariable Integer id){
        return new ResponseEntity<>(updateSeniority.update(newSeniority,id),HttpStatus.OK);
    }
}

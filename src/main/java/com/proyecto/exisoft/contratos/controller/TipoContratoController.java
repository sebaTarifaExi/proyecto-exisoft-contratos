package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.cliente.*;
import com.proyecto.exisoft.contratos.caseuse.tipocontrato.*;
import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.TipoContrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contratos")
public class TipoContratoController {
    @Autowired
    private GetTipoContrato getTipoContrato;
    @Autowired
    private CreateTipoContrato createTipoContrato;
    @Autowired
    private DeleteTipoContrato deleteTipoContrato;
    @Autowired
    private UpdateTipoContrato updateTipoContrato;
    @Autowired
    private FindByTcoTipoContrato findByTcoTipoContrato;

    @GetMapping("/")
    List<TipoContrato> get(){return getTipoContrato.getAll();}
    @PostMapping("/")
    ResponseEntity<TipoContrato> newTipoContrato (@RequestBody TipoContrato newTipoContrato){
        return new ResponseEntity<>(createTipoContrato.create(newTipoContrato), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteTipoContrato (@PathVariable Integer id){
        deleteTipoContrato.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<TipoContrato> updateTipoContrato (@RequestBody TipoContrato newTipoContrato, @PathVariable Integer id){
        return new ResponseEntity<>(updateTipoContrato.udpdate(newTipoContrato,id),HttpStatus.OK);
    }

    @GetMapping("/{tcoTipoContrato}")
    ResponseEntity<List<TipoContrato>> findByTcoTipoContrato (@PathVariable String tcoTipoContrato){
        return findByTcoTipoContrato.findByTcoTipoContrato(tcoTipoContrato);
    }

}

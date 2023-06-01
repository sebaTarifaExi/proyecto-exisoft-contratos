package com.proyecto.exisoft.contratos.controller;

import com.proyecto.exisoft.contratos.caseuse.cliente.*;
import com.proyecto.exisoft.contratos.caseuse.perfil.*;
import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private GetCliente getCliente;
    @Autowired
    private CreateCliente createCliente;
    @Autowired
    private DeleteCliente deleteCliente;
    @Autowired
    private UpdateCliente updateCliente;
    @Autowired
    private FindByCteNombre findByCteNombre;

    @GetMapping("/")
    List<Cliente> get(){return getCliente.getAll();}
    @PostMapping("/")
    ResponseEntity<Cliente> newCliente (@RequestBody Cliente newCliente){
        return new ResponseEntity<>(createCliente.create(newCliente), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity deleteCliente(@PathVariable Integer id){
        deleteCliente.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{id}")
    ResponseEntity<Cliente> updateCliente (@RequestBody Cliente newCliente, @PathVariable Integer id){
        return new ResponseEntity<>(updateCliente.udpdate(newCliente,id),HttpStatus.OK);
    }

    @GetMapping("/{cteNombre}")
    ResponseEntity<List<Cliente>> findByCteNombre (@PathVariable String cteNombre){
        return findByCteNombre.findByCteNombre(cteNombre);
    }

}

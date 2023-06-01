package com.proyecto.exisoft.contratos.caseuse.servicio;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Servicio;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindBySioNombre {
    @Autowired
    private ServicioService servicioService;

    public ResponseEntity<List<Servicio>> findBySioNombre(String nombre){
        return servicioService.findBySioNombreContainingIgnoreCase(nombre);
    }
}

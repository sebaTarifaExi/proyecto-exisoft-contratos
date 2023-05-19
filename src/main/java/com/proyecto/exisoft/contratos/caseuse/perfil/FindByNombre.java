package com.proyecto.exisoft.contratos.caseuse.perfil;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByNombre {
    private PerfilService perfilService;

    public FindByNombre(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public ResponseEntity<List<Perfil>> findByPilNombre(String nombre){
        return perfilService.findByPilNombre(nombre);
    }
}

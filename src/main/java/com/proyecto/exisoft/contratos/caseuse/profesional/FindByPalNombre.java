package com.proyecto.exisoft.contratos.caseuse.profesional;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByPalNombre {

    private ProfesionalService profesionalService;

    public FindByPalNombre(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public ResponseEntity<List<Profesional>> findByPalNombre (String nombre){
        return profesionalService.findByPalNombreContainingIgnoreCase(nombre);
    }
}

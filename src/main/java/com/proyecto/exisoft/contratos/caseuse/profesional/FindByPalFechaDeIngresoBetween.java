package com.proyecto.exisoft.contratos.caseuse.profesional;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class FindByPalFechaDeIngresoBetween {
    private ProfesionalService profesionalService;

    public FindByPalFechaDeIngresoBetween(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public ResponseEntity<List<Profesional>> findByPalFechaDeIngresoBetween(LocalDate begin, LocalDate end){
        return profesionalService.findByPalFechaDeIngresoBetween(begin, end);
    }
}

package com.proyecto.exisoft.contratos.caseuse.profesional;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FindByPalMail {

    private ProfesionalService profesionalService;

    public FindByPalMail(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public ResponseEntity<List<Profesional>> findByPalMail (String mail){
        return profesionalService.findByPalMailContainingIgnoreCase(mail);
    }
}

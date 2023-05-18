package com.proyecto.exisoft.contratos.caseuse.profesional;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.stereotype.Component;

@Component
public class CreateProfesional {
    private ProfesionalService profesionalService;

    public CreateProfesional(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public Profesional create(Profesional newProfesional){
        return profesionalService.create(newProfesional);
    }
}

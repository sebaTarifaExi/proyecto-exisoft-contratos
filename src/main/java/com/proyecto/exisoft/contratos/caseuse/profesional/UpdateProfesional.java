package com.proyecto.exisoft.contratos.caseuse.profesional;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.stereotype.Component;

@Component
public class UpdateProfesional {
    private ProfesionalService profesionalService;

    public UpdateProfesional(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public Profesional update(Profesional newProfesional, Integer id){
        return profesionalService.update(newProfesional,id);
    }
}

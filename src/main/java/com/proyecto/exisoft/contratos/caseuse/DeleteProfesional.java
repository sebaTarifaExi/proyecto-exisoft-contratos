package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.stereotype.Component;

@Component
public class DeleteProfesional {
    private ProfesionalService profesionalService;

    public DeleteProfesional(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }

    public void remove(Integer id){
        profesionalService.delete(id);
    }
}

package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SeniorityService;
import org.springframework.stereotype.Component;

@Component
public class CreateSeniority {
    private SeniorityService seniorityService;

    public CreateSeniority(SeniorityService seniorityService) {
        this.seniorityService = seniorityService;
    }

    public Seniority create(Seniority newSeniority){
        return seniorityService.save(newSeniority);
    }
}

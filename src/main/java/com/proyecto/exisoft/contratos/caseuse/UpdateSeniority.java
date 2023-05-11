package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SeniorityService;
import org.springframework.stereotype.Component;

@Component
public class UpdateSeniority {
    private SeniorityService seniorityService;

    public UpdateSeniority(SeniorityService seniorityService) {
        this.seniorityService = seniorityService;
    }

    public Seniority update(Seniority newSeniority, Integer id){
        return seniorityService.update(newSeniority,id);
    }
}

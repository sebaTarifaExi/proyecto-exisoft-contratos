package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SeniorityService;
import org.springframework.stereotype.Component;

@Component
public class DeleteSeniority {
    private SeniorityService seniorityService;

    public DeleteSeniority(SeniorityService seniorityService) {
        this.seniorityService = seniorityService;
    }

    public void delete(Integer id){
        seniorityService.delete(id);
    }
}

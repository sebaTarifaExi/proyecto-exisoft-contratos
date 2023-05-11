package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SeniorityService;

import java.util.List;

public class GetSeniorityImplement implements GetSeniority{

    private SeniorityService seniorityService;

    public GetSeniorityImplement(SeniorityService seniorityService) {
        this.seniorityService = seniorityService;
    }

    @Override
    public List<Seniority> getAll() {
        return seniorityService.getAllSeniority();
    }
}

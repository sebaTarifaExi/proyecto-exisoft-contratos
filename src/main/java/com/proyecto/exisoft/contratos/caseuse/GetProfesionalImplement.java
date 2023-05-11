package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.service.ProfesionalService;

import java.util.List;

public class GetProfesionalImplement implements GetProfesional{

    private ProfesionalService profesionalService;

    public GetProfesionalImplement(ProfesionalService profesionalService) {
        this.profesionalService = profesionalService;
    }


    @Override
    public List<Profesional> getAll() {
        return profesionalService.getAllProfesional();
    }
}

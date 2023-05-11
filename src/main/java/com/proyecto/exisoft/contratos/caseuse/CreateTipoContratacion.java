package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;

public class CreateTipoContratacion {
    private TipoContratacionService tipoContratacionService;

    public CreateTipoContratacion(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public TipoContratacion create(TipoContratacion newTipoContratacion){
        return tipoContratacionService.save(newTipoContratacion);
    }
}

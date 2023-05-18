package com.proyecto.exisoft.contratos.caseuse.tipocontratacion;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;
import org.springframework.stereotype.Component;

@Component
public class CreateTipoContratacion {
    private TipoContratacionService tipoContratacionService;

    public CreateTipoContratacion(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public TipoContratacion create(TipoContratacion newTipoContratacion){
        return tipoContratacionService.create(newTipoContratacion);
    }
}

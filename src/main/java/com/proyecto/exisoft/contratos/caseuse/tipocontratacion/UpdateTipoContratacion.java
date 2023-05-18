package com.proyecto.exisoft.contratos.caseuse.tipocontratacion;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;
import org.springframework.stereotype.Component;

@Component
public class UpdateTipoContratacion {
    private TipoContratacionService tipoContratacionService;

    public UpdateTipoContratacion(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public TipoContratacion update(TipoContratacion newTipoContratacion, Integer id){
        return tipoContratacionService.update(newTipoContratacion,id);
    }
}

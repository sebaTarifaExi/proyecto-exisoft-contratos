package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;

public class DeleteTipoContratacion {
    private TipoContratacionService tipoContratacionService;

    public DeleteTipoContratacion(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public void remove(Integer id){
        tipoContratacionService.delete(id);
    }
}

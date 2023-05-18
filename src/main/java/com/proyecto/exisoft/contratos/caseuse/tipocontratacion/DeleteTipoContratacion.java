package com.proyecto.exisoft.contratos.caseuse.tipocontratacion;

import com.proyecto.exisoft.contratos.service.TipoContratacionService;
import org.springframework.stereotype.Component;

@Component
public class DeleteTipoContratacion {
    private TipoContratacionService tipoContratacionService;

    public DeleteTipoContratacion(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public void delete(Integer id){
        tipoContratacionService.delete(id);
    }
}

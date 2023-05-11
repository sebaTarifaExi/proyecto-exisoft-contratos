package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;

import java.util.List;

public class GetTipoContratacionImplement implements GetTipoContratacion{

    private TipoContratacionService tipoContratacionService;

    public GetTipoContratacionImplement(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    @Override
    public List<TipoContratacion> getAll() {
        return tipoContratacionService.getAllTipoContratacion();
    }
}

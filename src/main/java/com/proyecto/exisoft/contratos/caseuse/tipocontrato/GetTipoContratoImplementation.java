package com.proyecto.exisoft.contratos.caseuse.tipocontrato;

import com.proyecto.exisoft.contratos.entity.TipoContrato;
import com.proyecto.exisoft.contratos.service.TipoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetTipoContratoImplementation implements GetTipoContrato{
    @Autowired
    private TipoContratoService tipoContratoService;


    @Override
    public List<TipoContrato> getAll() {
        return tipoContratoService.getAllTipoContrato();
    }
}

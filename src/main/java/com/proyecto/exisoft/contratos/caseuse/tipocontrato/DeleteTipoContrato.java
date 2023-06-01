package com.proyecto.exisoft.contratos.caseuse.tipocontrato;

import com.proyecto.exisoft.contratos.entity.TipoContrato;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.TipoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteTipoContrato {
    @Autowired
    private TipoContratoService tipoContratoService;

    public void delete(Integer id){tipoContratoService.delete(id);}
}

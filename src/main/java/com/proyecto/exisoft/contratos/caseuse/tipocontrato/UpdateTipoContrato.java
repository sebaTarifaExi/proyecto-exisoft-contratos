package com.proyecto.exisoft.contratos.caseuse.tipocontrato;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.TipoContrato;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.TipoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateTipoContrato {
    @Autowired
    private TipoContratoService tipoContratoService;

    public TipoContrato udpdate(TipoContrato newTipoContrato, Integer id){
        return tipoContratoService.update(newTipoContrato,id);
    }
}

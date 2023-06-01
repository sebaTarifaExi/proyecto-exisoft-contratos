package com.proyecto.exisoft.contratos.caseuse.tipocontrato;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.TipoContrato;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.TipoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByTcoTipoContrato {
    @Autowired
    private TipoContratoService tipoContratoService;

    public ResponseEntity<List<TipoContrato>> findByTcoTipoContrato(String tcoTipoContrato){
        return tipoContratoService.findByTcoTipoContratoContainingIgnoreCase(tcoTipoContrato);
    }
}

package com.proyecto.exisoft.contratos.caseuse.tipocontratacion;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.service.TipoContratacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByTcnNombre {
    private TipoContratacionService tipoContratacionService;

    public FindByTcnNombre(TipoContratacionService tipoContratacionService) {
        this.tipoContratacionService = tipoContratacionService;
    }

    public ResponseEntity<List<TipoContratacion>> findByTcnNombre(String tcnNombre){
        return tipoContratacionService.findByTcnNombre(tcnNombre);
    }
}

package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.repository.TipoContratacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoContratacionService {

    private TipoContratacionRepository tipoContratacionRepository;

    public TipoContratacionService(TipoContratacionRepository tipoContratacionRepository) {
        this.tipoContratacionRepository = tipoContratacionRepository;
    }

    List<TipoContratacion> getAllTipoContratacion(){return tipoContratacionRepository.findAll();}
}

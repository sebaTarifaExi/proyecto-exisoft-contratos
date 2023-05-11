package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.repository.ProfesionalRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesionalService {

    private final Log LOG = LogFactory.getLog(ProfesionalService.class);
    private ProfesionalRepository profesionalRepository;

    public ProfesionalService(ProfesionalRepository profesionalRepository) {
        this.profesionalRepository = profesionalRepository;
    }

    public List<Profesional> getAllProfesional(){
        return profesionalRepository.findAll();
    }

}

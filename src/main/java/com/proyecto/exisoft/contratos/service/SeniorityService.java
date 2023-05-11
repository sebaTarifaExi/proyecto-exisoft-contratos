package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.repository.SeniorityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeniorityService {

    private SeniorityRepository seniorityRepository;

    public SeniorityService(SeniorityRepository seniorityRepository) {
        this.seniorityRepository = seniorityRepository;
    }

    List<Seniority> getAllSeniority() {return seniorityRepository.findAll();}
}

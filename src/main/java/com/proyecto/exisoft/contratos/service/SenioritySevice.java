package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.repository.SeniorityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SenioritySevice {
    private SeniorityRepository seniorityRepository;

    public SenioritySevice(SeniorityRepository seniorityRepository) {
        this.seniorityRepository = seniorityRepository;
    }

    public List<Seniority> getAllSeniority(){
        return seniorityRepository.findAll();
    }
    public Seniority create (Seniority newSeniority){
        return seniorityRepository.save(newSeniority);
    }
    public void delete(Integer id){
        seniorityRepository.delete(new Seniority(id));
    }

    public Seniority update(Seniority newSeniority, Integer id){
        return seniorityRepository.findById(id)
                .map(
                        seniority -> {
                            seniority.setStyNombre(newSeniority.getStyNombre());
                            seniority.setStyDescripcion(newSeniority.getStyDescripcion());
                            return seniorityRepository.save(seniority);
                        }
                ).get();
    }
   }


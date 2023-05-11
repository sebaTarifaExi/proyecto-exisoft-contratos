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

    public Profesional save(Profesional newProfesional){
        return profesionalRepository.save(newProfesional);
    }

    public void delete(Integer id){
        profesionalRepository.delete(new Profesional(id));
    }

    public Profesional update(Profesional newProfesional, Integer id) {
        return profesionalRepository.findById(id)
                .map(
                        profesional -> {
                            profesional.setProfesionalNombre(newProfesional.getProfesionalNombre());
                            profesional.setProfesionalApellido(newProfesional.getProfesionalApellido());
                            profesional.setProfesionalFechaDeIngreso(newProfesional.getProfesionalFechaDeIngreso());
                            profesional.setProfesionalFechaDeNacimiento(newProfesional.getProfesionalFechaDeNacimiento());
                            profesional.setProfesionalDni(newProfesional.getProfesionalDni());
                            profesional.setProfesionalUnidadDeNegocios(newProfesional.getProfesionalUnidadDeNegocios());
                            profesional.setProfesionaClientes(newProfesional.getProfesionaClientes());
                            profesional.setProfesionalTelefono(newProfesional.getProfesionalTelefono());
                            profesional.setProfesionalMail(newProfesional.getProfesionalMail());
                            profesional.setProfesionalEstado(newProfesional.getProfesionalEstado());
                            profesional.setProfesionalFechaDeRenuncia(newProfesional.getProfesionalFechaDeRenuncia());
                            profesional.setPerfil(newProfesional.getPerfil());
                            profesional.setProfesionalCuit(newProfesional.getProfesionalCuit());
                            profesional.setProfesionalLegajo(newProfesional.getProfesionalLegajo());
                            profesional.setTipoContratacion(newProfesional.getTipoContratacion());
                            profesional.setSeniority(newProfesional.getSeniority());
                            return profesionalRepository.save(newProfesional);
                        }
                ).get();

    }

}

package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.entity.Profesional;
import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.repository.PerfilRepository;
import com.proyecto.exisoft.contratos.repository.ProfesionalRepository;
import com.proyecto.exisoft.contratos.repository.SeniorityRepository;
import com.proyecto.exisoft.contratos.repository.TipoContratacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProfesionalService {
    private ProfesionalRepository profesionalRepository;
    @Autowired
    private PerfilRepository perfilRepository;
    @Autowired
    private TipoContratacionRepository tipoContratacionRepository;
    @Autowired
    private SeniorityRepository seniorityRepository;

    public ProfesionalService(ProfesionalRepository profesionalRepository) {
        this.profesionalRepository = profesionalRepository;
    }
    public List<Profesional> getAllProfesional(){
        return profesionalRepository.findAll();
    }

    public Profesional create(Profesional newProfesional) {
        Perfil perfil = this.perfilRepository.findById(newProfesional.getPalPil().getId())
                .orElseThrow(() -> new IllegalArgumentException("El perfil no existe"));
        newProfesional.setPalPil(perfil);

        TipoContratacion tipoContratacion = this.tipoContratacionRepository.findById(newProfesional.getPalTcn().getId())
                .orElseThrow(() -> new IllegalArgumentException("El tipo de contratacion no existe"));
        newProfesional.setPalTcn(tipoContratacion);

        Seniority seniority = this.seniorityRepository.findById(newProfesional.getPalSty().getId())
                .orElseThrow(()->new IllegalArgumentException(("El seniority no existe")));
        newProfesional.setPalSty(seniority);

        return profesionalRepository.save(newProfesional);
    }

    public void delete(Integer id) {
        profesionalRepository.delete(new Profesional(id));
    }

    public Profesional update(Profesional newProfesional, Integer id) {
        Perfil perfil = this.perfilRepository.findById(newProfesional.getPalPil().getId())
                .orElseThrow(() -> new IllegalArgumentException("El perfil no existe"));
        TipoContratacion tipoContratacion = this.tipoContratacionRepository.findById(newProfesional.getPalTcn().getId())
                .orElseThrow(() -> new IllegalArgumentException("El tipo de contratacion no existe"));
        Seniority seniority = this.seniorityRepository.findById(newProfesional.getPalSty().getId())
                .orElseThrow(()->new IllegalArgumentException(("El seniority no existe")));

        return profesionalRepository.findById(id)
                .map(
                        profesional -> {
                            profesional.setPalNombre(newProfesional.getPalNombre());
                            profesional.setPalApellido(newProfesional.getPalApellido());
                            profesional.setPalFechaIngreso(newProfesional.getPalFechaIngreso());
                            profesional.setPalFechaNacimiento(newProfesional.getPalFechaNacimiento());
                            profesional.setPalDni(newProfesional.getPalDni());
                            profesional.setPalUnidadNegocio(newProfesional.getPalUnidadNegocio());
                            profesional.setPalClientes(newProfesional.getPalClientes());
                            profesional.setPalTelefono(newProfesional.getPalTelefono());
                            profesional.setPalMail(newProfesional.getPalMail());
                            profesional.setPalEstado(newProfesional.getPalEstado());
                            profesional.setPalFechaRenuncia(newProfesional.getPalFechaRenuncia());
                            profesional.setPalPil(perfil);
                            profesional.setPalCuit(newProfesional.getPalCuit());
                            profesional.setPalLegajo(newProfesional.getPalLegajo());
                            profesional.setPalTcn(tipoContratacion);
                            profesional.setPalSty(seniority);
                            return profesionalRepository.save(profesional);
                        }
                ).get();
    }

    public ResponseEntity<List<Profesional>> findByPalFechaDeIngresoBetween(LocalDate begin, LocalDate end){
        List<Profesional> listaDeProfesionalesBuscadosPorFechasDeIngreso = profesionalRepository.findByPalFechaIngresoBetween(begin, end);
        if(listaDeProfesionalesBuscadosPorFechasDeIngreso.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(listaDeProfesionalesBuscadosPorFechasDeIngreso, HttpStatus.OK);
        }
    }

    public ResponseEntity<List<Profesional>> findByPalNombreContainingIgnoreCase(String nombre){
        List<Profesional> listaDeProfesionalesBuscadosPorNombre = profesionalRepository.findByPalNombreContainingIgnoreCase(nombre);
        if(listaDeProfesionalesBuscadosPorNombre.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(listaDeProfesionalesBuscadosPorNombre, HttpStatus.OK);
        }
    }

   public ResponseEntity<List<Profesional>> findByPalMailContainingIgnoreCase(String mail){
        List<Profesional> listaDeProfesionalesBuscadosPorMail = profesionalRepository.findByPalMailContainingIgnoreCase(mail);
        if(listaDeProfesionalesBuscadosPorMail.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(listaDeProfesionalesBuscadosPorMail, HttpStatus.OK);
        }
    }

}

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

    public List<TipoContratacion> getAllTipoContratacion(){return tipoContratacionRepository.findAll();}

    public TipoContratacion save(TipoContratacion newTipoContratacion) {
        return tipoContratacionRepository.save(newTipoContratacion);
    }

    public void delete(Integer id){
        tipoContratacionRepository.delete(new TipoContratacion(id));
    }

    public TipoContratacion update(TipoContratacion newTipoContratacion, Integer id){
        return tipoContratacionRepository.findById(id)
                .map(
                        tipoContratacion->{
                            tipoContratacion.setTipoContratacionNombre(newTipoContratacion.getTipoContratacionNombre());
                            tipoContratacion.setTipoContratacionDescripcion(newTipoContratacion.getTipoContratacionDescripcion());
                            return tipoContratacionRepository.save(newTipoContratacion);
                        }
                ).get();

    }

}

package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import com.proyecto.exisoft.contratos.repository.TipoContratacionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoContratacionService {
    private TipoContratacionRepository tipoContratacionRepository;

    public TipoContratacionService(TipoContratacionRepository tipoContratacionRepository) {
        this.tipoContratacionRepository = tipoContratacionRepository;
    }
    public List<TipoContratacion> getAllTipoContratacion(){
        return tipoContratacionRepository.findAll();
    }

    public TipoContratacion create (TipoContratacion newTipoContratacion){
        return tipoContratacionRepository.save(newTipoContratacion);
    }
    public void delete(Integer id){
        tipoContratacionRepository.delete(new TipoContratacion(id));
    }

    public TipoContratacion update(TipoContratacion newTipoContratacion, Integer id){
        return tipoContratacionRepository.findById(id)
                .map(
                        tipoContratacion -> {
                            tipoContratacion.setTcnNombre(newTipoContratacion.getTcnNombre());
                            tipoContratacion.setTcnDescripcion(newTipoContratacion.getTcnDescripcion());
                            return tipoContratacionRepository.save(tipoContratacion);
                        }
                ).get();
    }

    public ResponseEntity<List<TipoContratacion>> findByTcnNombreContainingIgnoreCase(String nombre){
        List<TipoContratacion> listaDeContracionesBuscadasPorNombre = tipoContratacionRepository.findByTcnNombreContainingIgnoreCase(nombre);
        if(listaDeContracionesBuscadasPorNombre.isEmpty()){
            return new ResponseEntity<List<TipoContratacion>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<TipoContratacion>>(listaDeContracionesBuscadasPorNombre,HttpStatus.OK);
        }
    }
}

package com.proyecto.exisoft.contratos.service;
import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.TipoContrato;
import com.proyecto.exisoft.contratos.repository.TipoContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoContratoService {
    @Autowired
    private TipoContratoRepository tipoContratoRepository;

    public List<TipoContrato> getAllTipoContrato(){
        return tipoContratoRepository.findAll();
    }

    public TipoContrato create(TipoContrato newTipoContrato) {
        return tipoContratoRepository.save(newTipoContrato);
    }

    public void delete(Integer id) {
        tipoContratoRepository.delete(new TipoContrato(id));
    }

    public TipoContrato update(TipoContrato newTipoContrato, Integer id) {
        return tipoContratoRepository.findById(id)
                .map(
                        tipoContrato -> {
                            tipoContrato.setTcoTipoContrato(newTipoContrato.getTcoTipoContrato());
                            tipoContrato.setTcoTipoContrato(newTipoContrato.getTcoDescripcion());
                            return tipoContratoRepository.save(tipoContrato);
                        }
                ).get();
    }

    public ResponseEntity<List<TipoContrato>> findByTcoTipoContratoContainingIgnoreCase (String tcoTipoContrato){
        List<TipoContrato> listaDeTiposDeContratosPorNombre = tipoContratoRepository.findByTcoTipoContratoContainingIgnoreCase(tcoTipoContrato);
        if(listaDeTiposDeContratosPorNombre.isEmpty()){
            return new ResponseEntity<List<TipoContrato>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<TipoContrato>>(listaDeTiposDeContratosPorNombre,HttpStatus.OK);
        }
    }
}

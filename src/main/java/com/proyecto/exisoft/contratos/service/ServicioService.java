package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.*;
import com.proyecto.exisoft.contratos.repository.ClienteRepository;
import com.proyecto.exisoft.contratos.repository.ServicioRepository;
import com.proyecto.exisoft.contratos.repository.TipoContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {
    @Autowired
    private ServicioRepository servicioRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TipoContratoRepository tipoContratoRepository;
    public List<Servicio> getAllServicios(){return servicioRepository.findAll();}
    public Servicio createServicio (Servicio newServicio){
        Cliente cliente = this.clienteRepository.findById(newServicio.getSioCte().getId())
                .orElseThrow(() -> new IllegalArgumentException("El cliente no existe"));
        newServicio.setSioCte(cliente);

        TipoContrato tipoContrato = this.tipoContratoRepository.findById(newServicio.getSioTco().getId())
                .orElseThrow(() -> new IllegalArgumentException("El tipo de contrato no existe"));
        newServicio.setSioTco(tipoContrato);

        return servicioRepository.save(newServicio);}

    public void delete(Integer id){
        servicioRepository.delete(new Servicio(id));
    }

    public Servicio update(Servicio newServicio, Integer id){
        Cliente cliente = this.clienteRepository.findById(newServicio.getSioCte().getId())
                .orElseThrow(() -> new IllegalArgumentException("El cliente no existe"));
        TipoContrato tipoContrato = this.tipoContratoRepository.findById(newServicio.getSioTco().getId())
                .orElseThrow(() -> new IllegalArgumentException("El tipo de contrato no existe"));

        return servicioRepository.findById(id)
                .map(
                        servicio -> {
                            servicio.setSioNombre(newServicio.getSioNombre());
                            servicio.setSioCte(cliente);
                            servicio.setSioTco(tipoContrato);
                            servicio.setSioDs(newServicio.getSioDs());
                            servicio.setSioFechaInicio(newServicio.getSioFechaInicio());
                            servicio.setSioFechaFin(newServicio.getSioFechaFin());
                            return servicioRepository.save(servicio);
                        }
                ).get();
    }

    public ResponseEntity<List<Servicio>> findBySioNombreContainingIgnoreCase(String nombre){
        List<Servicio> listaDeServiciosBuscadosPorNombre = servicioRepository.findBySioNombreContainingIgnoreCase(nombre);
        if(listaDeServiciosBuscadosPorNombre.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(listaDeServiciosBuscadosPorNombre, HttpStatus.OK);
        }
    }
}

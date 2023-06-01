package com.proyecto.exisoft.contratos.caseuse.servicio;

import com.proyecto.exisoft.contratos.entity.Servicio;
import com.proyecto.exisoft.contratos.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetServicioImplementation implements GetServicio{
    @Autowired
    private ServicioService servicioService;


    @Override
    public List<Servicio> getAll() {
        return servicioService.getAllServicios();
    }
}

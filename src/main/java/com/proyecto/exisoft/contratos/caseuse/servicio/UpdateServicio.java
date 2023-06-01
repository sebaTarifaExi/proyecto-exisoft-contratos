package com.proyecto.exisoft.contratos.caseuse.servicio;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Servicio;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateServicio {
    @Autowired
    private ServicioService servicioService;

    public Servicio udpdate(Servicio newServicio, Integer id){
        return servicioService.update(newServicio,id);
    }
}

package com.proyecto.exisoft.contratos.caseuse.servicio;

import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteServicio {
    @Autowired
    private ServicioService servicioService;

    public void delete(Integer id){servicioService.delete(id);}
}

package com.proyecto.exisoft.contratos.caseuse.cliente;

import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCliente {
    @Autowired
    private ClienteSevice clienteSevice;

    public void delete(Integer id){clienteSevice.delete(id);}
}

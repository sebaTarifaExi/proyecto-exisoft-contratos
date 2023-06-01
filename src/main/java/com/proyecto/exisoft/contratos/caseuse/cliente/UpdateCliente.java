package com.proyecto.exisoft.contratos.caseuse.cliente;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCliente {
    @Autowired
    private ClienteSevice clienteSevice;

    public Cliente udpdate(Cliente newCliente, Integer id){
        return clienteSevice.update(newCliente,id);
    }
}

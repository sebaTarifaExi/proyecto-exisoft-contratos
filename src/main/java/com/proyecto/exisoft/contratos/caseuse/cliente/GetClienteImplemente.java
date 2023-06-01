package com.proyecto.exisoft.contratos.caseuse.cliente;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetClienteImplemente implements GetCliente{
    @Autowired
    private ClienteSevice clienteSevice;

    @Override
    public List<Cliente> getAll() {
        return clienteSevice.getAllCliente();
    }
}

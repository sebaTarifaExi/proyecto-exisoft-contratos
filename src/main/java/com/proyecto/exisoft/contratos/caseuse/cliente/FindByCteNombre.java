package com.proyecto.exisoft.contratos.caseuse.cliente;

import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.ClienteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindByCteNombre {
    @Autowired
    private ClienteSevice clienteSevice;

    public ResponseEntity<List<Cliente>> findByCteNombre(String nombre){
        return clienteSevice.findByCteNombreContainingIgnoreCase(nombre);
    }
}

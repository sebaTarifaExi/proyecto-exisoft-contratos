package com.proyecto.exisoft.contratos.service;


import com.proyecto.exisoft.contratos.entity.Cliente;
import com.proyecto.exisoft.contratos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteSevice {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    public Cliente create(Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    public void delete(Integer id) {
        clienteRepository.delete(new Cliente(id));
    }

    public Cliente update(Cliente newCliente, Integer id) {
        return clienteRepository.findById(id)
                .map(
                        cliente -> {
                            cliente.setCteNombre(newCliente.getCteNombre());
                            cliente.setCteDescripcion(newCliente.getCteDescripcion());
                            return clienteRepository.save(cliente);
                        }
                ).get();
    }

    public ResponseEntity<List<Cliente>> findByCteNombreContainingIgnoreCase (String nombre){
        List<Cliente> listaDePerfilesClientesPorNombre = clienteRepository.findByCteNombreContainingIgnoreCase(nombre);
        if(listaDePerfilesClientesPorNombre.isEmpty()){
            return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<Cliente>>(listaDePerfilesClientesPorNombre,HttpStatus.OK);
        }
    }
}

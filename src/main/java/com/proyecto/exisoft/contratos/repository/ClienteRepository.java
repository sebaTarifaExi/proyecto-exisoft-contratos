package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByCteNombreContainingIgnoreCase(String nombre);

}

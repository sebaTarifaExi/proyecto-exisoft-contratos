package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    List<Servicio> findBySioNombreContainingIgnoreCase(String nombre);
}

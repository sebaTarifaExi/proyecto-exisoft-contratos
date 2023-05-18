package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Seniority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeniorityRepository extends JpaRepository<Seniority, Integer> {

    List<Seniority> findByStyNombre(String nombre);
    Optional<Seniority> findByStyDescripcion(String descripcion);

}

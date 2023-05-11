package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TipoContratacionRepository extends JpaRepository<TipoContratacion, Integer> {

    List<TipoContratacion> findByNombre(String nombre);
    Optional<TipoContratacion> findByDescripcion(String descripcion);
}

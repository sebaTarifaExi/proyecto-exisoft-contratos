package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TipoContratacionRepository extends JpaRepository<TipoContratacion, Integer> {

    List<TipoContratacion> findByTcnNombre(String nombre);
    List<TipoContratacion> findByTcnDescripcion(String descripcion);
}

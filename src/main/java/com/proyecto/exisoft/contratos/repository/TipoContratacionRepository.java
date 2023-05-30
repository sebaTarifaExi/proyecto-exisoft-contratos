package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TipoContratacionRepository extends JpaRepository<TipoContratacion, Integer> {
   // @Query("SELECT T From TIPO_CONTRATACION T WHERE"+
   // " CONCAT(T.tcn_id, T.tcn_nombre, T.tcn_descripcion)"+
    //" LIKE %?1%")
    List<TipoContratacion> findByTcnNombreContainingIgnoreCase(String nombre);
    List<TipoContratacion> findByTcnDescripcion(String descripcion);
}

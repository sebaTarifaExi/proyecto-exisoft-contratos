package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.TipoContratacion;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TipoContratacionRepository extends JpaRepository<TipoContratacion, Integer> {
   /* @Query("select tcn.tcn_nombre\n" +
            "from TIPO_CONTRATACION tcn\n" +
            "where tcn.tcn_nombre\n" +
            "like '%nombre%'")*/
    List<TipoContratacion> findByTcnNombre(String nombre);
    List<TipoContratacion> findByTcnDescripcion(String descripcion);
}

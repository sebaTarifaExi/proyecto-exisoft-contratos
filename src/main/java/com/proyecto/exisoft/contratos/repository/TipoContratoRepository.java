package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.TipoContrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoContratoRepository extends JpaRepository<TipoContrato, Integer> {

    List<TipoContrato> findByTcoTipoContratoContainingIgnoreCase(String tcoTipoContrato);

}

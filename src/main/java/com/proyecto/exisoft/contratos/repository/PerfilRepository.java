package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
    List<Perfil> findByNombre(String nombre);

}

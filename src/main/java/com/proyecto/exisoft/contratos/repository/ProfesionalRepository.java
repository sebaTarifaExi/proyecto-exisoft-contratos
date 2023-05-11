package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Integer> {

    List<Profesional> findByNombre(String nombre);
    List<Profesional> findByNombreLike(String nombre);
    Optional<Profesional> findByNombreAndApellido(String nombre, String apellido);
    List<Profesional> findByFechaIngresoBetween(LocalDate begin, LocalDate end);
}

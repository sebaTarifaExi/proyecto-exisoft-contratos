package com.proyecto.exisoft.contratos.repository;

import com.proyecto.exisoft.contratos.entity.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Integer> {
    List<Profesional> findByPalNombreContainingIgnoreCase(String nombre);
    List<Profesional> findByPalNombreAndPalApellido(String nombre, String apellido);
    List<Profesional> findByPalFechaIngresoBetween(LocalDate begin, LocalDate end);
    List<Profesional> findByPalFechaNacimiento(LocalDate nacimiento);
    List<Profesional> findByPalMailContainingIgnoreCase(String mail);

}

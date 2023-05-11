package com.proyecto.exisoft.contratos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "PEFIL")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pil_id", nullable = false, unique = true)
    private Integer perfilId;
    @Column(name = "pil_nombre", length = 25, nullable = true)
    private String perfilNombre;
    @Column(name = "pil_valor", nullable = false)
    private Float perfilValor;
    @Column(name = "pil_descripcion", length = 255, nullable = true)
    private String perfilDescripcion;
    @OneToOne(mappedBy = "PERFIL")
    @JsonManagedReference
    private Profesional profesional;

    public Perfil(Integer perfilId, String perfilNombre, Float perfilValor, String perfilDescripcion, Profesional profesional) {
        this.perfilId = perfilId;
        this.perfilNombre = perfilNombre;
        this.perfilValor = perfilValor;
        this.perfilDescripcion = perfilDescripcion;
        this.profesional = profesional;
    }

    public Integer getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Integer perfilId) {
        this.perfilId = perfilId;
    }

    public String getPerfilNombre() {
        return perfilNombre;
    }

    public void setPerfilNombre(String perfilNombre) {
        this.perfilNombre = perfilNombre;
    }

    public Float getPerfilValor() {
        return perfilValor;
    }

    public void setPerfilValor(Float perfilValor) {
        this.perfilValor = perfilValor;
    }

    public String getPerfilDescripcion() {
        return perfilDescripcion;
    }

    public void setPerfilDescripcion(String perfilDescripcion) {
        this.perfilDescripcion = perfilDescripcion;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "perfilId=" + perfilId +
                ", perfilNombre='" + perfilNombre + '\'' +
                ", perfilValor=" + perfilValor +
                ", perfilDescripcion='" + perfilDescripcion + '\'' +
                ", profesional=" + profesional +
                '}';
    }
}

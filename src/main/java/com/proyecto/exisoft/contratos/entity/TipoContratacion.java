package com.proyecto.exisoft.contratos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_CONTRATACION")
public class TipoContratacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tcn_id", nullable = false)
    private Integer tipoContratacionId;
    @Column(name = "tcn_nombre", length = 50, nullable = true)
    private String tipoContratacionNombre;
    @Column(name="tcn_descripcion", length = 255, nullable = true)
    private String tipoContratacionDescripcion;
    @OneToOne(mappedBy = "TIPO_CONTRATACION")
    @JsonManagedReference
    private Profesional profesional;

    public TipoContratacion(Integer tipoContratacionId, String tipoContratacionNombre, String tipoContratacionDescripcion, Profesional profesional) {
        this.tipoContratacionId = tipoContratacionId;
        this.tipoContratacionNombre = tipoContratacionNombre;
        this.tipoContratacionDescripcion = tipoContratacionDescripcion;
        this.profesional = profesional;
    }

    public Integer getTipoContratacionId() {
        return tipoContratacionId;
    }

    public void setTipoContratacionId(Integer tipoContratacionId) {
        this.tipoContratacionId = tipoContratacionId;
    }

    public String getTipoContratacionNombre() {
        return tipoContratacionNombre;
    }

    public void setTipoContratacionNombre(String tipoContratacionNombre) {
        this.tipoContratacionNombre = tipoContratacionNombre;
    }

    public String getTipoContratacionDescripcion() {
        return tipoContratacionDescripcion;
    }

    public void setTipoContratacionDescripcion(String tipoContratacionDescripcion) {
        this.tipoContratacionDescripcion = tipoContratacionDescripcion;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "TipoContratacion{" +
                "tipoContratacionId=" + tipoContratacionId +
                ", tipoContratacionNombre='" + tipoContratacionNombre + '\'' +
                ", tipoContratacionDescripcion='" + tipoContratacionDescripcion + '\'' +
                ", profesional=" + profesional +
                '}';
    }
}

package com.proyecto.exisoft.contratos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "SENIORITY")
public class Seniority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sty_id", nullable = false)
    private Integer seniorityId;
    @Column(name = "sty_nombre", length = 50, nullable = false)
    private String seniorityNombre;
    @Column(name="sty_descripcion", length = 50, nullable = true)
    private String seniorityDescripcion;
    @OneToOne(mappedBy = "SENIORITY")
    @JsonManagedReference
    private Profesional profesional;

    public Seniority(Integer seniorityId, String seniorityNombre, String seniorityDescripcion, Profesional profesional) {
        this.seniorityId = seniorityId;
        this.seniorityNombre = seniorityNombre;
        this.seniorityDescripcion = seniorityDescripcion;
        this.profesional = profesional;
    }

    public Seniority(Integer id) {
        this.seniorityId = id;
    }

    public Integer getSeniorityId() {
        return seniorityId;
    }

    public void setSeniorityId(Integer seniorityId) {
        this.seniorityId = seniorityId;
    }

    public String getSeniorityNombre() {
        return seniorityNombre;
    }

    public void setSeniorityNombre(String seniorityNombre) {
        this.seniorityNombre = seniorityNombre;
    }

    public String getSeniorityDescripcion() {
        return seniorityDescripcion;
    }

    public void setSeniorityDescripcion(String seniorityDescripcion) {
        this.seniorityDescripcion = seniorityDescripcion;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "Seniority{" +
                "seniorityId=" + seniorityId +
                ", seniorityNombre='" + seniorityNombre + '\'' +
                ", seniorityDescripcion='" + seniorityDescripcion + '\'' +
                ", profesional=" + profesional +
                '}';
    }
}

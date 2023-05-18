package com.proyecto.exisoft.contratos.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "SENIORITY")
public class Seniority {
    @Id
    @Column(name = "sty_id", nullable = false)
    private Integer id;

    @Column(name = "sty_nombre", nullable = false, length = 50)
    private String styNombre;

    @Lob
    @Column(name = "sty_descripcion")
    private String styDescripcion;

    public Seniority() {
    }

    public Seniority(Integer id) {
        this.id = id;
    }

    public Seniority(Integer id, String styNombre, String styDescripcion) {
        this.id = id;
        this.styNombre = styNombre;
        this.styDescripcion = styDescripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStyNombre() {
        return styNombre;
    }

    public void setStyNombre(String styNombre) {
        this.styNombre = styNombre;
    }

    public String getStyDescripcion() {
        return styDescripcion;
    }

    public void setStyDescripcion(String styDescripcion) {
        this.styDescripcion = styDescripcion;
    }

}
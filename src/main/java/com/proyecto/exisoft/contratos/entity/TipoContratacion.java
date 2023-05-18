package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_CONTRATACION")
public class TipoContratacion {
    @Id
    @Column(name = "tcn_id", nullable = false)
    private Integer id;

    @Column(name = "tcn_nombre", length = 50)
    private String tcnNombre;

    @Lob
    @Column(name = "tcn_descripcion")
    private String tcnDescripcion;

    public TipoContratacion() {
    }
    public TipoContratacion(Integer id) {
        this.id = id;
    }

    public TipoContratacion(Integer id, String tcnNombre, String tcnDescripcion) {
        this.id = id;
        this.tcnNombre = tcnNombre;
        this.tcnDescripcion = tcnDescripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTcnNombre() {
        return tcnNombre;
    }

    public void setTcnNombre(String tcnNombre) {
        this.tcnNombre = tcnNombre;
    }

    public String getTcnDescripcion() {
        return tcnDescripcion;
    }

    public void setTcnDescripcion(String tcnDescripcion) {
        this.tcnDescripcion = tcnDescripcion;
    }

}
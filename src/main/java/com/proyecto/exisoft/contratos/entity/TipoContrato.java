package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_CONTRATO")
public class TipoContrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tco_id", nullable = false)
    private Integer id;

    @Column(name = "tco_tipo_contrato", nullable = false, length = 25)
    private String tcoTipoContrato;

    @Column(name = "tco_descripcion", nullable = true, length = 255)
    private String tcoDescripcion;

    public TipoContrato(Integer id) {
        this.id = id;
    }

    public TipoContrato() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTcoTipoContrato() {
        return tcoTipoContrato;
    }

    public void setTcoTipoContrato(String tcoTipoContrato) {
        this.tcoTipoContrato = tcoTipoContrato;
    }

    public String getTcoDescripcion() {
        return tcoDescripcion;
    }

    public void setTcoDescripcion(String tcoDescripcion) {
        this.tcoDescripcion = tcoDescripcion;
    }
}

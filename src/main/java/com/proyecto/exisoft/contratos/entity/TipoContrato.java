package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_CONTRATO")
public class TipoContrato {
    @Id
    @Column(name = "tco_id", nullable = false)
    private Integer id;

    @Column(name = "tco_tipo_contrato", length = 25, nullable = false)
    private String tcnTipoContrato;

    @Lob
    @Column(name = "tco_descripcion", length = 255, nullable = true)
    private String tcoDescripcion;

    public TipoContrato() {
    }

    public TipoContrato(Integer id) {
        this.id = id;
    }
}

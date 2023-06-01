package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cte_id", nullable = false)
    private Integer id;

    @Column(name = "cte_nombre", nullable = false, length = 25)
    private String cteNombre;

    @Column(name = "cte_descripcion", nullable = true, length = 255)
    private String cteDescripcion;

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCteNombre() {
        return cteNombre;
    }

    public void setCteNombre(String cteNombre) {
        this.cteNombre = cteNombre;
    }

    public String getCteDescripcion() {
        return cteDescripcion;
    }

    public void setCteDescripcion(String cteDescripcion) {
        this.cteDescripcion = cteDescripcion;
    }
}

package com.proyecto.exisoft.contratos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SERVICIO")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sio_id", nullable = false)
    private Integer id;

    @Column(name = "sio_nombre", nullable = false, length = 50)
    private String sioNombre;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "sio_cte_id", nullable = false)
    @JsonManagedReference
    private Cliente sioCte;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "sio_tco_id", nullable = false)
    @JsonManagedReference
    private TipoContrato sioTco;

    @Column(name = "sio_ds", nullable = true)
    private Integer sioDs;

    @Column(name = "sio_fecha_inicio", nullable = true)
    private LocalDate sioFechaInicio;

    @Column(name = "sio_fecha_fin", nullable = true)
    private LocalDate sioFechaFin;

    public Servicio(Integer id) {
        this.id = id;
    }

    public Servicio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSioNombre() {
        return sioNombre;
    }

    public void setSioNombre(String sioNombre) {
        this.sioNombre = sioNombre;
    }

    public Cliente getSioCte() {
        return sioCte;
    }

    public void setSioCte(Cliente sioCte) {
        this.sioCte = sioCte;
    }

    public TipoContrato getSioTco() {
        return sioTco;
    }

    public void setSioTco(TipoContrato sioTco) {
        this.sioTco = sioTco;
    }

    public Integer getSioDs() {
        return sioDs;
    }

    public void setSioDs(Integer sioDs) {
        this.sioDs = sioDs;
    }

    public LocalDate getSioFechaInicio() {
        return sioFechaInicio;
    }

    public void setSioFechaInicio(LocalDate sioFechaInicio) {
        this.sioFechaInicio = sioFechaInicio;
    }

    public LocalDate getSioFechaFin() {
        return sioFechaFin;
    }

    public void setSioFechaFin(LocalDate sioFechaFin) {
        this.sioFechaFin = sioFechaFin;
    }
}

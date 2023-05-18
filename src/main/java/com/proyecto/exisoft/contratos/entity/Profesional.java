package com.proyecto.exisoft.contratos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PROFESIONAL")
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pal_id", nullable = false)
    private Integer id;

    @Column(name = "pal_nombre", nullable = false, length = 25)
    private String palNombre;

    @Column(name = "pal_apellido", nullable = false, length = 25)
    private String palApellido;

    @Column(name = "pal_fecha_ingreso")
    private LocalDate palFechaIngreso;

    @Column(name = "pal_fecha_nacimiento", nullable = false)
    private LocalDate palFechaNacimiento;

    @Column(name = "pal_dni", nullable = false, length = 10)
    private String palDni;

    @Column(name = "pal_unidad_negocio", nullable = false, length = 15)
    private String palUnidadNegocio;

    @Column(name = "pal_clientes", nullable = false, length = 10)
    private String palClientes;

    @Column(name = "pal_telefono", nullable = false, length = 15)
    private String palTelefono;

    @Column(name = "pal_mail", length = 50)
    private String palMail;

    @Column(name = "pal_estado", nullable = false, length = 10)
    private String palEstado;

    @Column(name = "pal_fecha_renuncia")
    private LocalDate palFechaRenuncia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "pal_pil_id", nullable = false)
    private Perfil palPil;

    @Column(name = "pal_cuit", length = 13)
    private String palCuit;

    @Column(name = "pal_legajo", length = 10)
    private String palLegajo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pal_tcn_id", insertable=false, updatable=false)
    private TipoContratacion palTcn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pal_sty_id", insertable=false, updatable=false)
    private Seniority palSty;

    public Profesional() {
    }

    public Profesional(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPalNombre() {
        return palNombre;
    }

    public void setPalNombre(String palNombre) {
        this.palNombre = palNombre;
    }

    public String getPalApellido() {
        return palApellido;
    }

    public void setPalApellido(String palApellido) {
        this.palApellido = palApellido;
    }

    public LocalDate getPalFechaIngreso() {
        return palFechaIngreso;
    }

    public void setPalFechaIngreso(LocalDate palFechaIngreso) {
        this.palFechaIngreso = palFechaIngreso;
    }

    public LocalDate getPalFechaNacimiento() {
        return palFechaNacimiento;
    }

    public void setPalFechaNacimiento(LocalDate palFechaNacimiento) {
        this.palFechaNacimiento = palFechaNacimiento;
    }

    public String getPalDni() {
        return palDni;
    }

    public void setPalDni(String palDni) {
        this.palDni = palDni;
    }

    public String getPalUnidadNegocio() {
        return palUnidadNegocio;
    }

    public void setPalUnidadNegocio(String palUnidadNegocio) {
        this.palUnidadNegocio = palUnidadNegocio;
    }

    public String getPalClientes() {
        return palClientes;
    }

    public void setPalClientes(String palClientes) {
        this.palClientes = palClientes;
    }

    public String getPalTelefono() {
        return palTelefono;
    }

    public void setPalTelefono(String palTelefono) {
        this.palTelefono = palTelefono;
    }

    public String getPalMail() {
        return palMail;
    }

    public void setPalMail(String palMail) {
        this.palMail = palMail;
    }

    public String getPalEstado() {
        return palEstado;
    }

    public void setPalEstado(String palEstado) {
        this.palEstado = palEstado;
    }

    public LocalDate getPalFechaRenuncia() {
        return palFechaRenuncia;
    }

    public void setPalFechaRenuncia(LocalDate palFechaRenuncia) {
        this.palFechaRenuncia = palFechaRenuncia;
    }

    public Perfil getPalPil() {
        return palPil;
    }

    public void setPalPil(Perfil palPil) {
        this.palPil = palPil;
    }

    public String getPalCuit() {
        return palCuit;
    }

    public void setPalCuit(String palCuit) {
        this.palCuit = palCuit;
    }

    public String getPalLegajo() {
        return palLegajo;
    }

    public void setPalLegajo(String palLegajo) {
        this.palLegajo = palLegajo;
    }

    public TipoContratacion getPalTcn() {
        return palTcn;
    }

    public void setPalTcn(TipoContratacion palTcn) {
        this.palTcn = palTcn;
    }

    public Seniority getPalSty() {
        return palSty;
    }

    public void setPalSty(Seniority palSty) {
        this.palSty = palSty;
    }

   // public void agregarPerfil(Perfil perfil){

   // }

}
package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "PROFESIONAL")
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pal_id", nullable = false)
    private Integer profesionalId;
    @Column(name = "pal_nombre", length = 25, nullable = false)
    private String profesionalNombre;
    @Column(name = "pal_apellido", length = 25, nullable = false)
    private String profesionalApellido;
    @Column(name = "pal_fecha_ingreso", nullable = true)
    private LocalDate profesionalFechaDeIngreso;
    @Column(name = "pal_fecha_nacimiento", nullable = false)
    private LocalDate profesionalFechaDeNacimiento;
    @Column(name = "pal_dni", length = 10, nullable = false)
    private String profesionalDni;
    @Column(name = "pal_unidad_negocio", length = 15, nullable = false)
    private String profesionalUnidadDeNegocios;
    @Column(name = "pal_clientes", length = 10, nullable = false)
    private String profesionaClientes;
    @Column(name = "pal_telefono", length = 15, nullable = false)
    private String profesionalTelefono;
    @Column(name = "pal_mail", length = 50, nullable = true)
    private String profesionalMail;
    @Column(name = "pal_estado", length = 10, nullable = false)
    private String profesionalEstado;
    @Column(name = "pal_fecha_renuncia", nullable = true)
    private LocalDate profesionalFechaDeRenuncia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pal_pil_id",referencedColumnName = "pil_id")
    private Perfil perfil;
    @Column(name = "pal_cuit", length = 13,nullable = true)
    private String profesionalCuit;
    @Column(name = "pal_legajo", length = 10, nullable = true)
    private String profesionalLegajo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pal_tcn_id",referencedColumnName = "tcn_id")
    private TipoContratacion tipoContratacion;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pal_sty_id",referencedColumnName = "sty_id")
    private Seniority seniority;

    public Profesional(Integer profesionalId, String profesionalNombre, String profesionalApellido, LocalDate profesionalFechaDeIngreso, LocalDate profesionalFechaDeNacimiento, String profesionalDni, String profesionalUnidadDeNegocios, String profesionaClientes, String profesionalTelefono, String profesionalMail, String profesionalEstado, LocalDate profesionalFechaDeRenuncia, Perfil perfil, String profesionalCuit, String profesionalLegajo, TipoContratacion tipoContratacion, Seniority seniority) {
        this.profesionalId = profesionalId;
        this.profesionalNombre = profesionalNombre;
        this.profesionalApellido = profesionalApellido;
        this.profesionalFechaDeIngreso = profesionalFechaDeIngreso;
        this.profesionalFechaDeNacimiento = profesionalFechaDeNacimiento;
        this.profesionalDni = profesionalDni;
        this.profesionalUnidadDeNegocios = profesionalUnidadDeNegocios;
        this.profesionaClientes = profesionaClientes;
        this.profesionalTelefono = profesionalTelefono;
        this.profesionalMail = profesionalMail;
        this.profesionalEstado = profesionalEstado;
        this.profesionalFechaDeRenuncia = profesionalFechaDeRenuncia;
        this.perfil = perfil;
        this.profesionalCuit = profesionalCuit;
        this.profesionalLegajo = profesionalLegajo;
        this.tipoContratacion = tipoContratacion;
        this.seniority = seniority;
    }

    public Profesional(Integer id){this.profesionalId = id;}

    public Integer getProfesionalId() {
        return profesionalId;
    }

    public void setProfesionalId(Integer profesionalId) {
        this.profesionalId = profesionalId;
    }

    public String getProfesionalNombre() {
        return profesionalNombre;
    }

    public void setProfesionalNombre(String profesionalNombre) {
        this.profesionalNombre = profesionalNombre;
    }

    public String getProfesionalApellido() {
        return profesionalApellido;
    }

    public void setProfesionalApellido(String profesionalApellido) {
        this.profesionalApellido = profesionalApellido;
    }

    public LocalDate getProfesionalFechaDeIngreso() {
        return profesionalFechaDeIngreso;
    }

    public void setProfesionalFechaDeIngreso(LocalDate profesionalFechaDeIngreso) {
        this.profesionalFechaDeIngreso = profesionalFechaDeIngreso;
    }

    public LocalDate getProfesionalFechaDeNacimiento() {
        return profesionalFechaDeNacimiento;
    }

    public void setProfesionalFechaDeNacimiento(LocalDate profesionalFechaDeNacimiento) {
        this.profesionalFechaDeNacimiento = profesionalFechaDeNacimiento;
    }

    public String getProfesionalDni() {
        return profesionalDni;
    }

    public void setProfesionalDni(String profesionalDni) {
        this.profesionalDni = profesionalDni;
    }

    public String getProfesionalUnidadDeNegocios() {
        return profesionalUnidadDeNegocios;
    }

    public void setProfesionalUnidadDeNegocios(String profesionalUnidadDeNegocios) {
        this.profesionalUnidadDeNegocios = profesionalUnidadDeNegocios;
    }

    public String getProfesionaClientes() {
        return profesionaClientes;
    }

    public void setProfesionaClientes(String profesionaClientes) {
        this.profesionaClientes = profesionaClientes;
    }

    public String getProfesionalTelefono() {
        return profesionalTelefono;
    }

    public void setProfesionalTelefono(String profesionalTelefono) {
        this.profesionalTelefono = profesionalTelefono;
    }

    public String getProfesionalMail() {
        return profesionalMail;
    }

    public void setProfesionalMail(String profesionalMail) {
        this.profesionalMail = profesionalMail;
    }

    public String getProfesionalEstado() {
        return profesionalEstado;
    }

    public void setProfesionalEstado(String profesionalEstado) {
        this.profesionalEstado = profesionalEstado;
    }

    public LocalDate getProfesionalFechaDeRenuncia() {
        return profesionalFechaDeRenuncia;
    }

    public void setProfesionalFechaDeRenuncia(LocalDate profesionalFechaDeRenuncia) {
        this.profesionalFechaDeRenuncia = profesionalFechaDeRenuncia;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getProfesionalCuit() {
        return profesionalCuit;
    }

    public void setProfesionalCuit(String profesionalCuit) {
        this.profesionalCuit = profesionalCuit;
    }

    public String getProfesionalLegajo() {
        return profesionalLegajo;
    }

    public void setProfesionalLegajo(String profesionalLegajo) {
        this.profesionalLegajo = profesionalLegajo;
    }

    public TipoContratacion getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(TipoContratacion tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "profesionalId=" + profesionalId +
                ", profesionalNombre='" + profesionalNombre + '\'' +
                ", profesionalApellido='" + profesionalApellido + '\'' +
                ", profesionalFechaDeIngreso=" + profesionalFechaDeIngreso +
                ", profesionalFechaDeNacimiento=" + profesionalFechaDeNacimiento +
                ", profesionalDni='" + profesionalDni + '\'' +
                ", profesionalUnidadDeNegocios='" + profesionalUnidadDeNegocios + '\'' +
                ", profesionaClientes='" + profesionaClientes + '\'' +
                ", profesionalTelefono='" + profesionalTelefono + '\'' +
                ", profesionalMail='" + profesionalMail + '\'' +
                ", profesionalEstado='" + profesionalEstado + '\'' +
                ", profesionalFechaDeRenuncia=" + profesionalFechaDeRenuncia +
                ", perfil=" + perfil +
                ", profesionalCuit='" + profesionalCuit + '\'' +
                ", profesionalLegajo='" + profesionalLegajo + '\'' +
                ", tipoContratacion=" + tipoContratacion +
                ", seniority=" + seniority +
                '}';
    }
}

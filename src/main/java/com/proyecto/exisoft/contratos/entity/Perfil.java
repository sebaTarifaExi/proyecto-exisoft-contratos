package com.proyecto.exisoft.contratos.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PERFIL")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pil_id", nullable = false)
    private Integer id;

    @Column(name = "pil_nombre", nullable = false, length = 25)
    private String pilNombre;

  //  @Column(name = "pil_valor")
  //  private Double pilValor;

    @Lob
    @Column(name = "pil_descripcion")
    private String pilDescripcion;

    public Perfil() {
    }

    public Perfil(Integer id) {
        this.id = id;
    }

    public Perfil(String pilNombre /*Double pilValor*/, String pilDescripcion) {
        this.pilNombre = pilNombre;
        //this.pilValor = pilValor;
        this.pilDescripcion = pilDescripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPilNombre() {
        return pilNombre;
    }

    public void setPilNombre(String pilNombre) {
        this.pilNombre = pilNombre;
    }

   /* public Double getPilValor() {
        return pilValor;
    }*/

//    public void setPilValor(Double pilValor) {
//        this.pilValor = pilValor;
//    }

    public String getPilDescripcion() {
        return pilDescripcion;
    }

    public void setPilDescripcion(String pilDescripcion) {
        this.pilDescripcion = pilDescripcion;
    }

}
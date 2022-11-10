/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.entities;

/**
 *
 * @author user
 */
public class MatriculaEntity {
    public Integer id_matricula;
    public Integer credito;
    public String codigo;
    public Integer id_seccion;
    public Integer id_curso;
    public Integer id_profesor;
    public Integer aprobado;

    public Integer getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Integer id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(Integer id_seccion) {
        this.id_seccion = id_seccion;
    }

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public Integer getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Integer id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Integer getAprobado() {
        return aprobado;
    }

    public void setAprobado(Integer aprobado) {
        this.aprobado = aprobado;
    }

    public MatriculaEntity(Integer id_matricula, Integer credito, String codigo, Integer id_seccion, Integer id_curso, Integer id_profesor, Integer aprobado) {
        this.id_matricula = id_matricula;
        this.credito = credito;
        this.codigo = codigo;
        this.id_seccion = id_seccion;
        this.id_curso = id_curso;
        this.id_profesor = id_profesor;
        this.aprobado = aprobado;
    }
}

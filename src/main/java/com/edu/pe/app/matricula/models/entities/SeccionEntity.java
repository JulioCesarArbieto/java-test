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
public class SeccionEntity {

    public Integer id_seccion;
    public String nombre;
    public String turno;
    public String descripcion;
    public Integer estado;

    public Integer getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(Integer id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public SeccionEntity(Integer id_seccion, String nombre, String turno, String descripcion, Integer estado) {
        this.id_seccion = id_seccion;
        this.nombre = nombre;
        this.turno = turno;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public SeccionEntity(){
        
    }
}

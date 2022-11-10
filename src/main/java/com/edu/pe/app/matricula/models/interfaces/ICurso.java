/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.interfaces;

import com.edu.pe.app.matricula.models.entities.CursoEntity;

/**
 *
 * @author user
 */
public interface ICurso extends ICRUD<CursoEntity>{
    public abstract CursoEntity getByIdSeccion(Integer idSeccion);
}

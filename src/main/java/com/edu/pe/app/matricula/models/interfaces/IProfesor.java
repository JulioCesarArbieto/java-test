/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.interfaces;

import com.edu.pe.app.matricula.models.entities.ProfesorEntity;

/**
 *
 * @author user
 */
public interface IProfesor extends ICRUD<ProfesorEntity>{
     public abstract ProfesorEntity getByIdCuro(Integer idCuros);
     public abstract ProfesorEntity getByIdSeccion(Integer idSeccion);
}

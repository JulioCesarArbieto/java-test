/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.interfaces;

import com.edu.pe.app.matricula.models.entities.EstudianteEntity;
import java.util.List;

/**
 *
 * @author user
 */
public interface IEstudiante extends ICRUD<EstudianteEntity>{
     public abstract List<EstudianteEntity> listByCode(String code);
     public abstract EstudianteEntity listByDni(String dni);
}

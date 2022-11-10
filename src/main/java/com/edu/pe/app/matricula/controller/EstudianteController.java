/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.controller;

import com.edu.pe.app.matricula.models.daos.EstudianteDAO;
import com.edu.pe.app.matricula.models.entities.EstudianteEntity;

/**
 *
 * @author user
 */
public class EstudianteController {
    
    public boolean InsertEstdiante(EstudianteEntity estudianteEntity){
        return new EstudianteDAO().insert(estudianteEntity);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.test;

import com.edu.pe.app.matricula.controller.EstudianteController;
import com.edu.pe.app.matricula.models.entities.EstudianteEntity;

/**
 *
 * @author user
 */
public class TestEstudiante {
    public static void main(String[] args) throws Exception {
      
        EstudianteController controller= new EstudianteController();
        EstudianteEntity estudianteEntity= new EstudianteEntity(
                null,
                "MARTIN",
                "ARBIETO",
                "87654323",
                "arbieto.jc@gmail.com", 
                "987654321",
                1
        );
        boolean isOk= controller.InsertEstdiante(estudianteEntity);
        if(isOk){
            System.out.println("Se creo correctamente el Etudiante "); 
        }else{
             System.out.println("Error al crear el estudiante "); 
        }
    }
}

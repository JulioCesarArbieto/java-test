/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.test;

import com.edu.pe.app.matricula.models.connection.ConnectionDB;

/**
 *
 * @author user
 */
public class TestConnection {
    public static void main(String[] args) {
        
        ConnectionDB.newInstance();
        
        
    }
}

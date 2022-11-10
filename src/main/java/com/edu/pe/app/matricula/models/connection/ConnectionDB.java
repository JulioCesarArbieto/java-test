/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class ConnectionDB {
    private static ConnectionDB instance = null;
    //API JDBC
    private static Connection con;

    private static final String URL = "jdbc:mysql://localhost:3307/dbmatriculaapp";
    //Driver de la Base de DATOS
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //Credenciales
    private static final String USER = "root";
    private static final String PASSWORD = "Aforo255#2019";

    private ConnectionDB() {

        try {

            //Generar una instancia del driver para poder utilizarlo
            Class.forName(DRIVER).newInstance();
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Esta conectado a la BD");

        } catch (Exception e) {
            System.out.println("Error la intentar conectarse a la BD");
            e.printStackTrace();
        }

    }
    //Método para crear la instancia de conexión a la base de datos
    public synchronized static ConnectionDB newInstance() {
        if (instance == null) {
            instance = new ConnectionDB();
        }
        return instance;
    }
    //Método para retornar la instancia de la Conexion Creada a la BD
    public Connection getConnection(){
    return con;
    }
    //Método para cerrar la conexión

    public void close(){
       instance=null;
    }
}

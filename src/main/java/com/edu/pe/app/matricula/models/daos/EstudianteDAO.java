/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.daos;

import com.edu.pe.app.matricula.models.connection.ConnectionDB;
import com.edu.pe.app.matricula.models.entities.EstudianteEntity;
import com.edu.pe.app.matricula.models.interfaces.IEstudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class EstudianteDAO implements IEstudiante{

    private ConnectionDB con; //Conexión de Base de datos
    private PreparedStatement pstm; //Consultas en la base de datos
    private ResultSet res;  //Resultado de las consultas

    public EstudianteDAO() {
        con = ConnectionDB.newInstance();
        pstm = null;
        res = null;
    }
    @Override
    public List<EstudianteEntity> listByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstudianteEntity listByDni(String dni) {
         final String SQL_SELECT = "select * from estudiante where dni=?";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean insert(EstudianteEntity estudianteEntity) {
        Boolean resultFlag = false;
            final String SQL_INSERT = "insert into estudiante values(?,?,?,?,?,?,?)";
            estudianteEntity.setCodigo(cadenaAleatoria(10));
            try {
                pstm = con.getConnection().prepareStatement(SQL_INSERT);
                pstm.setString(1,estudianteEntity.getCodigo());
                pstm.setString(2,estudianteEntity.getNombre());
                pstm.setString(3,estudianteEntity.getApellido());
                pstm.setString(4,estudianteEntity.getDni());
                pstm.setString(5,estudianteEntity.getCorreo());
                pstm.setString(6,estudianteEntity.getCelular());
                pstm.setInt(7,estudianteEntity.getEstado());

                pstm.execute();
                resultFlag=true;

            } catch (Exception e) {
                System.out.println("Error al insertar ESTUDIANTE :"+e.getMessage());
                resultFlag=false;
                e.printStackTrace();
            } finally {
                close();
            }
          return resultFlag;    
    }

    @Override
    public Boolean update(EstudianteEntity t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteEntity> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstudianteEntity selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String cadenaAleatoria(int longitud) {
        //String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return "INST-"+cadena;
    }
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    private void close() {
        try {
           if(res!=null)res.close();
           if(pstm!=null)pstm.close();
           if(con!=null)con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar :"+e.getMessage());
            e.printStackTrace();
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.pe.app.matricula.models.interfaces;

import java.util.List;

/**
 *
 * @author user
 */
public interface ICRUD<T> {
    public abstract Boolean insert(T t);
    public abstract Boolean update(T t);
    public abstract List<T> selectAll();
    public abstract T selectById(Object id);
    public abstract void delete(Object id);   
}

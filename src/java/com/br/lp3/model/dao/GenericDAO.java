/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.dao;

import java.util.List;

/**
 *
 * @author 31240550
 */
public interface GenericDAO<T> {
    //CRUD
    public boolean insert(T t);
    public List<T> read();
    public boolean update(T t);
    public boolean remove(T t);
}

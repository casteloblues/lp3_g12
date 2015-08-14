/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 31240550
 */
public class ConnectionFactory {
    
    private static final String DB = "testedb";
    private static final String USER = "castelo";
    private static final String PWD = "123";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection("jdbc:dery://localhost/" + DB + "crete = true; user =" + USER + "; password =" + PWD);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.controller;

/**
 *
 * @author 31240550
 */
public class LoginManager {
    
    public static boolean authorize(String username, String password) {
        return ("cacique".equals(username) && "123".equals(password));
    }
    
}

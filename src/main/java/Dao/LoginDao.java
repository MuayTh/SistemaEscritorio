/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author lucho
 */
public interface LoginDao {
    public Login log(String Usuario, String contrasenia, String rol);
}

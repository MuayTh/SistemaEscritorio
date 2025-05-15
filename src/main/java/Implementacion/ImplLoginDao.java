/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conexion.ConexionSQL;
import Dao.LoginDao;
import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucho
 */
public class ImplLoginDao implements LoginDao{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionSQL cn = new ConexionSQL();

    @Override
    public Login log(String Usuario, String contrasenia, String rol) {
        Login log = new Login();
        String sql = "select * from login where Usuario=? and Contrasenia=? and Rol = ?";
        try {
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, contrasenia);
            ps.setString(3, rol);
            rs = ps.executeQuery();
            if(rs.next()){
                log.setIdUsuario(rs.getInt("idUsuario"));
                log.setUsuario(rs.getString("Usuario"));
                log.setContrasenia(rs.getString("Contrasenia"));
                log.setRol(rs.getString("Rol"));
            }
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        return log;
    }
    
}

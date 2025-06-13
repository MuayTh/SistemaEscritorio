/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conexion.ConexionSQL;
import Dao.CrudGenerica;
import Modelo.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class ImplTipoHabitacionDao implements CrudGenerica<TipoHabitacion>{
    ConexionSQL cn = new ConexionSQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public void Crear(TipoHabitacion tipoHabitacion) {
    String sql = "INSERT INTO TipoHabitacion(nombre, descripcion, precio, imagenRuta) "
            + "VALUES (?, ?, ?, ?)";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tipoHabitacion.getNombre());
            ps.setString(2, tipoHabitacion.getDescripcion());
            ps.setDouble(3, tipoHabitacion.getPrecio());
            ps.setString(4, tipoHabitacion.getImagenRuta());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }    
    }

    @Override
    public void Modificar(TipoHabitacion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoHabitacion BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TipoHabitacion> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

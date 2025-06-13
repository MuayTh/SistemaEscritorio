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
import java.util.ArrayList;
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
            Logger.getLogger(ImplTipoHabitacionDao.class.getName()).log(Level.SEVERE, null, e);
        }    
    }

    @Override
    public void Modificar(TipoHabitacion tipoHabitacion) {
        String sql = "UPDATE Empleado SET Nombre=?, Descripcion=?, Precio=?, imagenRuta=? "
            + "WHERE idTipoHabitacion=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tipoHabitacion.getNombre());
            ps.setString(2, tipoHabitacion.getDescripcion());
            ps.setDouble(3, tipoHabitacion.getPrecio());
            ps.setString(4, tipoHabitacion.getImagenRuta());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplTipoHabitacionDao.class.getName()).log(Level.SEVERE, null, e);
        }    }

    @Override
    public void Eliminar(int idTipoHabitacion) {
        String sql = "DELETE FROM TipoHabitacion WHERE idTipoHabitacion=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idTipoHabitacion);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }    
    }

    @Override
    public TipoHabitacion BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TipoHabitacion> listar() {
        List<TipoHabitacion> tipoHabitacion = new ArrayList<>();
        String sql= "SELECT * FROM TipoHabitacion";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //rs = ps.executeQuery(sql);
            while (rs.next()) {
                tipoHabitacion.add(new TipoHabitacion(
                    rs.getInt("idTipoHabitacion"),
                    rs.getString("Nombre"),
                    rs.getString("Descripcion"),
                    rs.getDouble("Precio"),
                    rs.getString("ImagenRuta")
                ));
            }
        }catch(SQLException e){
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return tipoHabitacion;    
    }
    
}

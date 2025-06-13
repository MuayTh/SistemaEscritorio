/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conexion.ConexionSQL;
import Dao.CrudGenerica;
import Modelo.Cliente;
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
 * @author lucho
 */
public class ImplClienteDao implements CrudGenerica<Cliente>{
    //ConexionSQL con = new Conexion.ConexionSQL();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    @Override
    public void Crear(Cliente cliente) {
        String sql = "INSERT INTO Cliente(idCliente, Nombre, Apellidos, Dni) values(?,?,?,?)";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modificar(Cliente cliente) {
        String sql = "UPDATE Cliente SET Nombre=?, Apellidos=?, Dni=? WHERE idCliente=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDni());
            ps.setInt(4, cliente.getIdCliente());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void Eliminar(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente BuscarPorId(int idCliente) {
        String sql = "SELECT * FROM Cliente WHERE idCliente=?";
        try{
            ps.setInt(1, idCliente);
            rs = ps.executeQuery(sql);
            if (rs.next()) {
                return new Cliente(
                    rs.getInt("idCliente"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Dni")
                );
            }
        } catch (SQLException e) {
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;

    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> cliente = new ArrayList<>();
        String sql= "SELECT * FROM Cliente";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //rs = ps.executeQuery(sql);
            while (rs.next()) {
                cliente.add(new Cliente(
                    rs.getInt("idCliente"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Dni")
                ));
            }
        }catch(SQLException e){
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return cliente;
    }
    
}

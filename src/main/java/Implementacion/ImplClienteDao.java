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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucho
 */
public class ImplClienteDao implements CrudGenerica<Cliente>{
    ConexionSQL con = new Conexion.ConexionSQL();
    Connection cn;
    ResultSet rs;
    PreparedStatement ps;
    @Override
    public void Crear(Cliente entidad) {
        String sql = "INSERT INTO Clientes(idCliente, Dni, Nombre, Apellidos) values(?,?,?,?)";
        try(PreparedStatement ps = cn.prepareStatement(sql)){} catch (SQLException ex) {
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modificar(Cliente entidad) {

    }

    @Override
    public void Eliminar(int id) {

    }

    @Override
    public Cliente BuscarPorId(int id) {

        return null;

    }
    
}

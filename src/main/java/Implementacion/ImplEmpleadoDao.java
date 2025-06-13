    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conexion.ConexionSQL;
import Dao.CrudGenerica;
import Dao.EmpleadoDao;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author lucho
 */
public class ImplEmpleadoDao implements CrudGenerica<Empleado>{
    ConexionSQL cn = new ConexionSQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void Crear(Empleado empleado) {
        String sql = "INSERT INTO Empleado(idEmpleado, Nombre, Apellidos, Codigo) values(?,?,?,?)";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void Modificar(Empleado empleado) {
        String sql = "UPDATE Empleado SET Nombre=?, Apellidos=?, Codigo=?, Dni=? WHERE idEmpleado=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getCodigo());
            ps.setInt(4, empleado.getIdEmpleado());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void Eliminar(int idEmpleado) {
        String sql = "DELETE FROM Empleado WHERE idEmpleado=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplEmpleadoDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public Empleado BuscarPorId(int idEmpleado) {
String sql = "SELECT * FROM Empleado WHERE idEmpleado=?";
        try{
            ps.setInt(1, idEmpleado);
            rs = ps.executeQuery(sql);
            if (rs.next()) {
                return new Empleado(
                    rs.getInt("idEmpleado"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Codigo")
                );
            }
        } catch (SQLException e) {
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;    }

    @Override
    public List<Empleado> listar() {
List<Empleado> empleado = new ArrayList<>();
        String sql= "SELECT * FROM Cliente";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            //rs = ps.executeQuery(sql);
            while (rs.next()) {
                empleado.add(new Empleado(
                    rs.getInt("idEmpleado"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Codigo")
                ));
            }
        }catch(SQLException e){
            Logger.getLogger(ImplClienteDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return empleado;    }
    
    
    
}

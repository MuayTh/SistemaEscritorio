    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conexion.ConexionSQL;
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
public class ImplEmpleadoDao implements EmpleadoDao{
    ConexionSQL cn = new ConexionSQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public boolean RegistrarEmpleado(Empleado empleado) {
        String sql = "Insert into Empleados(id, codigo, nombre) values (?,?,?)";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getId());
            ps.setString(2, empleado.getCodigo());
            ps.setString(3, empleado.getNombre());
            ps.execute();
            return true;
        } catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public List<Empleado> listarEmpleados() {
        List<Empleado> ListaEmpleados = new ArrayList<>();
        String sql = "Select * from empleados";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Empleado emp = new Empleado(
                rs.getInt("id"),
                rs.getString("codigo"),
                rs.getString("nombre")
                );
                
                ListaEmpleados.add(emp);
                
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
    return ListaEmpleados;
    }

    @Override
    public boolean modificarEmpleado(Empleado empleado) {
        String sql = "update Empleados set codigo=?, nombre=? where id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getCodigo());
            ps.setString(2, empleado.getNombre());
            ps.setInt(3, empleado.getId());
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public boolean eliminarEmpleado(int id) {
        String sql = "DELETE from Empleados where id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e){
            System.out.println(e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public Empleado BuscarEmpleadoPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

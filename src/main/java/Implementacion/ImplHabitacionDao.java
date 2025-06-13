
package Implementacion;

import Conexion.ConexionSQL;
import Dao.CrudGenerica;
import Modelo.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ImplHabitacionDao implements CrudGenerica<Habitacion>{
    ConexionSQL cn = new ConexionSQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public void Crear(Habitacion habitacion) {
        String sql = "INSERT INTO "
                + "Habitacion(Numero, Piso, Estado, idTipoHabitacion)"
                + "VALUES (?,?,?,?)";
        try {
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, habitacion.getNumero());
            ps.setInt(2, habitacion.getPiso());
            ps.setString(3, habitacion.getEstado().name());
            ps.setDouble(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplHabitacionDao.class.getName()).log(Level.SEVERE, null, e);
        }    
    }

    @Override
    public void Modificar(Habitacion habitacion) {
        String sql = "UPDATE Habitacion SET Numero=?, Piso=?, Estado=?, idTipoHabitacion=?"
                + "WHERE idHabitacion=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, habitacion.getNumero());
            ps.setInt(2, habitacion.getPiso());
            ps.setString(3, habitacion.getEstado().name());
            ps.setInt(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            ps.setInt(4, habitacion.getIdHabitacion());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplHabitacionDao.class.getName()).log(Level.SEVERE, null, e);
        }    }

    @Override
    public void Eliminar(int idHabitacion) {
    String sql = "DELETE FROM Habitacion WHERE idEmpleado=?";
        try{
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ImplHabitacionDao.class.getName()).log(Level.SEVERE, null, e);
        }    }

    @Override
    public Habitacion BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habitacion> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

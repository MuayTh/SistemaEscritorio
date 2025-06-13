
package Implementacion;

import Conexion.ConexionSQL;
import Dao.CrudGenerica;
import Modelo.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
                + "Habitacion(numero, piso, estado, idTipoHabitacion)"
                + "VALUES (?,?,?,?)";
        try {
            con = ConexionSQL.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, habitacion.getNumero());
            ps.setInt(2, habitacion.getPiso());
            ps.setString(3, habitacion.getEstado().name());
            ps.setDouble(4, habitacion.getPrecio());
            ps.setInt(5, habitacion.getTipo().getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }    }

    @Override
    public void Modificar(Habitacion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Habitacion BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habitacion> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

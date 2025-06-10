/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author lucho
 */
public class ConexionSQL{
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=proyecto;encrypt=true;trustServerCertificate=true;";
    private static final String USUARIO = "sa";
    private static final String CONTRASEÑA = "Misteriox101";
    private static Connection conexion = null;
    
    public ConexionSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexión a la base de datos SQL Server exitosa.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver de SQL Server.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos SQL Server.");
            e.printStackTrace();
        }
    }
    
    public static Connection obtenerConexion() {
        if (conexion == null) {
            new ConexionSQL();
        }
        return conexion;
    }
    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión a la base de datos cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión.");
                e.printStackTrace();
            } finally {
                conexion = null;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Modelo.Alojamiento;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.EstadoHabitacion;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

/**
 *
 * @author lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CÓDIGO DE TESTEO
        //Cliente cliente1 = new Cliente("1234", "Pepe");
        //Reserva reserva1 = new Reserva("001", "18/04/2025", "27/04/205", "30/04/2025", cliente1, 012, "presidencial", 2500, "Reservada");
        /*LocalTime horaActual = LocalTime.now();
        ZonedDateTime ahora = ZonedDateTime.now();
        System.out.println(" "+horaActual);
        System.out.println(" "+ahora);
        ZoneId zona = ahora.getZone();
        System.out.println("Zona horaria: " + zona);*/
        //System.out.println(" " +reserva1.toString());
        
        //Empleado emp1 = new Empleado("AL15", "Alejandro");
        //Alojamiento aloj1 = new Alojamiento("001", "27/04/2025", "30/04/2025", cliente1, emp1, 012, "presidencial", 2500, "Ocupada");
        //System.out.println(" " +aloj1.toString());
        
        //Clase enum
        //EstadoHabitacion estados = EstadoHabitacion.DISPONIBLE;
        //estados.name();
        //EstadoHabitacion.values();
        //System.out.println(" ---->" +estados.name());
        //System.out.println(" ---->" +EstadoHabitacion.values());
        //System.out.println(" ESTADOS QUE EXISTEN EN LA HABITACIÓN ---->" +Arrays.toString(EstadoHabitacion.values()));
        /*try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=proyecto;encrypt=true;trustServerCertificate=true;",
                "sa", "Misteriox101");
            System.out.println("Conexión exitosa.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Error al conectar: " + e.getMessage());
            e.printStackTrace();
        }*/
    }
    
}

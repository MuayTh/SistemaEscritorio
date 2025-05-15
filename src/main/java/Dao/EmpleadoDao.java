/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Proyecto.Empleado;
import java.util.List;

/**
 *
 * @author lucho
 */
public interface EmpleadoDao {
    public boolean RegistrarEmpleado(Empleado empleado);
    public List<Empleado> listarEmpleados();
    public boolean modificarEmpleado(Empleado empleado);
    public boolean eliminarEmpleado(int id);
    public Empleado BuscarEmpleadoPorId (int id);
}

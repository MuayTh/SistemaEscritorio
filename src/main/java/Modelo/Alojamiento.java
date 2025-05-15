/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author lucho
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alojamiento extends Habitacion{
    private String numAlojamiento;
    private String fechaInicioAlojamiento, fechaSalidaAlojamiento;
    private Cliente cli;
    private Empleado emp;
    private double pagoDias;
    public Alojamiento(String numAlojamiento, String fechaInicioAlojamiento, String fechaSalidaAlojamiento, Cliente cli, Empleado emp, int numeroHabitacion, String descripcion, double precio, String estadoHabitacion) {
        super(numeroHabitacion, descripcion, precio, estadoHabitacion);
        this.numAlojamiento = numAlojamiento;
        this.fechaInicioAlojamiento = fechaInicioAlojamiento;
        this.fechaSalidaAlojamiento = fechaSalidaAlojamiento;
        this.cli = cli;
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "numAlojamiento=" + numAlojamiento + 
                ", fechaInicioAlojamiento=" + fechaInicioAlojamiento + ", fechaSalidaAlojamiento=" + fechaSalidaAlojamiento + 
                ", Datos del cliente=" + cli + ", Empleado que registró=" + emp + '}';
    }
    
}

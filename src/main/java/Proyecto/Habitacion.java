/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author lucho
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Habitacion {
    private int numeroHabitacion;
    private String descripcion;
    private double precio;
    private String estadoHabitacion;

    public Habitacion(int numeroHabitacion, String descripcion, double precio, String estadoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estadoHabitacion = estadoHabitacion;
    }
    
}

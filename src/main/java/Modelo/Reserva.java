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
public class Reserva extends Habitacion{
    private String numReserva;
    private String fechaReserva, fechaIngreso, fechaSalida;
    private Cliente cli;

    public Reserva(String numReserva, String fechaReserva, String fechaIngreso, String fechaSalida, Cliente cli, int numeroHabitacion, String descripcion, double precio, String estadoHabitacion) {
        super(numeroHabitacion, descripcion, precio, estadoHabitacion);
        this.numReserva = numReserva;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cli = cli;
    }

    @Override
    public String toString() {
        return "Reserva{" + "numReserva=" + numReserva + 
        ", fechaReserva=" + fechaReserva + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", "
                + "cli=" + cli + '}';
    }
    
}   

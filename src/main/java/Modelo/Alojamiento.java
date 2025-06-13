/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author lucho
 */
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alojamiento{
    private int idAlojamiento;
    private Reserva reserva; // puede ser null
    private Cliente cliente;
    private Empleado empleado;
    private Habitacion habitacion;
    private LocalDate fechaAlojamiento;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public Alojamiento(int idAlojamiento, Reserva reserva, Cliente cliente, Empleado empleado, Habitacion habitacion, LocalDate fechaAlojamiento, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.idAlojamiento = idAlojamiento;
        this.reserva = reserva;
        this.cliente = cliente;
        this.empleado = empleado;
        this.habitacion = habitacion;
        this.fechaAlojamiento = fechaAlojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", reserva=" + reserva + ", cliente=" + cliente + ", empleado=" + empleado + ", habitacion=" + habitacion + ", fechaAlojamiento=" + fechaAlojamiento + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + '}';
    }  
}

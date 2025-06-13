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
public class Habitacion {
    private int idHabitacion;
    private String numero;
    private int piso;
    private EstadoHabitacion estado;
    private TipoHabitacion tipoHabitacion;

    public Habitacion(int idHabitacion, String numero, int piso, EstadoHabitacion estado, TipoHabitacion tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.piso = piso;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }
    
}

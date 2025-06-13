/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
@Getter
@Setter
public class TipoHabitacion {
    private int idTipoHabitacion;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagenRuta;

    public TipoHabitacion(int idTipoHabitacion, String nombre, String descripcion, double precio, String imagenRuta) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagenRuta = imagenRuta;
    }
}

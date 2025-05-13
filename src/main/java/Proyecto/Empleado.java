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
public class Empleado extends Persona{
    String codigo;
    public Empleado(String codigo, String nombre) {
        super(nombre);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos del Empleado{" + "codigo=" + codigo + ", nombre="+ getNombre() +'}';
    }
    
}

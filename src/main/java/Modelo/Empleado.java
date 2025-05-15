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
public class Empleado extends Persona{
    private int id;
    private String codigo;

    public Empleado(String nombre) {
        super(nombre);
    }
    
    
    public Empleado(int id,String codigo, String nombre) {
        super(nombre);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos del Empleado{" + "codigo=" + codigo + ", nombre="+ getNombre() +'}';
    }
    
}

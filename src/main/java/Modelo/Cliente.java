/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author lucho
 */
@Getter
@Setter
public class Cliente extends Persona{
    private int idCliente;
    private String dni, apellidos;
   
    public Cliente(int idCliente, String dni, String nombre, String apellidos) {
        super(nombre);
        this.dni = dni;
        this.idCliente = idCliente;
        this.apellidos = apellidos;
    }

     @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" +getNombre()+ '}';
    }
    
}

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
    private String dni;
   
    public Cliente(int idCliente,String nombre, String apellidos,  String dni) {
        super(nombre, apellidos);
        this.dni = dni;
        this.idCliente = idCliente;
    }

     @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" +getNombre()+ '}';
    }
    
}

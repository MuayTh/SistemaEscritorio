/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author lucho
 */
public class Cliente extends Persona{
    private String dni;

    public Cliente(String dni, String nombre) {
        super(nombre);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

     @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" +getNombre()+ '}';
    }
    
}

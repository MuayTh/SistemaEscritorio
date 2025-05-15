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

public class Login {
    private int idUsuario;
    private String usuario;
    private String contrasenia;
    private String rol;
    public Login(int idUsuario, String usuario, String contrasenia, String rol){
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }
    public Login(){}
}

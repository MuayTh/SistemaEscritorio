/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

/**
 *
 * @author lucho
 */
public interface CrudGenerica<T> {
    public void Crear(T entidad);
    public void Modificar(T entidad);
    public void Eliminar(int id);
    public T     BuscarPorId(int id);
    
}

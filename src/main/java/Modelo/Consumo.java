
package Modelo;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LUIS
 */
@Getter
@Setter
public class Consumo {
    private int idConsumo;
    private Alojamiento alojamiento;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Consumo(int idConsumo, Alojamiento alojamiento, String descripcion, int cantidad, double precioUnitario) {
        this.idConsumo = idConsumo;
        this.alojamiento = alojamiento;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    public double getTotal(){
        return cantidad + precioUnitario;
    }
    
}

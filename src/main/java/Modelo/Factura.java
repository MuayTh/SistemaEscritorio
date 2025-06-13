
package Modelo;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LUIS
 */
@Getter
@Setter
public class Factura {
    private int idFactura;
    private Alojamiento alojamiento;
    private LocalDate fechaEmision;
    private double totalConsumo;
    private double totalAlojamiento;

    public Factura(int idFactura, Alojamiento alojamiento, LocalDate fechaEmision, double totalConsumo, double totalAlojamiento) {
        this.idFactura = idFactura;
        this.alojamiento = alojamiento;
        this.fechaEmision = fechaEmision;
        this.totalConsumo = totalConsumo;
        this.totalAlojamiento = totalAlojamiento;
    }
    
    
    
    public double getTotalFinal() {
        return totalConsumo + totalAlojamiento;
    }
}

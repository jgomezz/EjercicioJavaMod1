package poo._09.herencia;

public class VentaLoreto extends Venta{

    public final static double IGV_LORETO = 0.0;

    public double calcularImpuesto(){
        this.igv = IGV_LORETO;
        return monto*igv;
    }


}

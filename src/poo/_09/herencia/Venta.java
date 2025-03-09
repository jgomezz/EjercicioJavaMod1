package poo._09.herencia;

public class Venta {

    public final static double IGV_DEFECTO = 0.18;

    protected int monto;
    protected double igv;


    public double calcularImpuesto(){
        this.igv = IGV_DEFECTO;
        return monto*igv;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}

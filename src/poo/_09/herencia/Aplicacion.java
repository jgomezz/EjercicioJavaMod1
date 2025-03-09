package poo._09.herencia;

public class Aplicacion {

    public static void main(String[] args) {
        
        VentaLima lima = new VentaLima();
        lima.setMonto(100);
        System.out.println(lima.calcularImpuesto());
        
        VentaLoreto iquitos = new VentaLoreto();
        iquitos.setMonto(100);
        System.out.println(iquitos.calcularImpuesto());

    }
}

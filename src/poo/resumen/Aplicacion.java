package poo.resumen;

public class Aplicacion {

    public static void main(String[] args) {

        //Computadora miPC = new Computadora();

        Computadora miPC = new Computadora("Intel","32 GB",
                "300 W", "GPU","1 T");

        miPC.ejecutarProgramas();

    }
}

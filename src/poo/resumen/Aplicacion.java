package poo.resumen;

public class Aplicacion {

    public static void main(String[] args) {

        //Computadora miPC = new Computadora();

        Computadora miPC = new Computadora("Intel",32,
                "300 W", "GPU",1023);


        // Llamadas a metodos donde se pasa u valor y se devuelve otro valor
        boolean valorRetornado = miPC.ejecutarProgramas("Excel");
        if (valorRetornado) {
            System.out.println("Computadora adecuada");
        }

        // Llamadas a metodos
        miPC.almacenarDatos();

        // Llamadas a metodos
        miPC.realizarCalculos();

    }
}

package pe.edu.tecsup.lab03._02.interfaces.ejercicio;

public class Computadora implements SoporteTarjetaGrafica {

    protected String tipoCpu;
    protected String fabricante;

    @Override
    public void realizarJuegosEnLinea() {
        System.out.println("Falta verificar si la computadora soporta juegos en linea");
    }
}

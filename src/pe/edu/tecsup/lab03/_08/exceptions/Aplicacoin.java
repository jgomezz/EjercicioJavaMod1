package pe.edu.tecsup.lab03._08.exceptions;
/*
Sesión 03 - ejercicio 10 - Excepciones
En un proceso de coción, el horno no puede estar por
encima de los 1000 grados. Realizar el código que en
caso se produzca un aumento de la temperatura mayor a
1000 grados sea detectado como una anomalia y se deberá
apagar el horno ( deberá imprimir un mensaje
de "apagado del horno" )
 */
public class Aplicacoin {

    private static final int TEMPERATURA_LIMITE = 1000;

    public static void main(String[] args) {

        int temperaturaHorno = obtenerTemperaturaDelHorno();
        try {
            if  ( temperaturaHorno >= TEMPERATURA_LIMITE ) {
                throw new Exception("Apagado del Horno");
            }
            System.out.println("Temperatura del horno normal");
        } catch (Exception e) {
            System.err.println("URGENTE->" +e.getMessage());
        }


    }

    /**
     * Metodo que obtiene la temperatura actual del horno
     * @return
     */
    private static int obtenerTemperaturaDelHorno() {
        return 1200;
    }
}

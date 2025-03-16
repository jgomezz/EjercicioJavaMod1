package pe.edu.tecsup._11.util.math;

public class Aplicacion {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            double valor = Math.random()*50;

            //double nroSuperior  = Math.ceil(valor);
            int nroSuperior  = (int) Math.ceil(valor);

            //System.out.println("nroSuperior: " + nroSuperior);
            if (nroSuperior > 25)
                System.out.println(Math.pow(nroSuperior,2));
            else
                System.out.println(nroSuperior);

        }

    }
}

package pe.edu.tecsup._01.paquetes.ejercicio2.core;

import pe.edu.tecsup._01.paquetes.ejercicio2.equipo.RedmiNote11;

public class Aplicacion {

    public static void main(String[] args) {

        /*
        RedmiNote11 rn11 = new RedmiNote11("Xiaomi","Redmi Note 11",
                2022, "4 Gb");

        System.out.println(rn11.getModelo());
        */

        RedmiNote11 rn11 = new RedmiNote11();
        rn11.setMarca("Xiaomi");
        rn11.setModelo("Redmi Note 11");

        System.out.println(rn11.getModelo());

    }

}

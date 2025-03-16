package pe.edu.tecsup.lab03._01.paquetes.ejercicio2.core;

import pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo.EquipoMovil;
import pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo.EquipoMovilSamsung;
import pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo.EquipoMovilXiaomi;
import pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo.EquipoMovilApple;
import pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo.RedmiNote11;

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
        /*
        EquuipoMovilApple apple = new EquuipoMovilApple();
        apple.setMarca("Apple");

        System.out.println(apple.getMarca());

        EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi();
        xiaomi.setMarca("Xiaomi");

        EquipoMovilSamsung samsung = new EquipoMovilSamsung();
        samsung.setMarca("Samsung");
        */

/*
        EquipoMovil apple = new EquipoMovilApple();
        apple.setMarca("Apple");
        System.out.println(apple.getMarca());

        EquipoMovil xiaomi = new EquipoMovilXiaomi();
        xiaomi.setMarca("Xiaomi");
        System.out.println(xiaomi.getMarca());

        EquipoMovil samsung = new EquipoMovilSamsung();
        samsung.setMarca("Samsung");
        System.out.println(samsung.getMarca());
*/

        // Define una variabla de la clase base
        EquipoMovil movil;

        // HAgo referencia a varias clases hijas
        movil = new EquipoMovilApple();
        movil.setMarca("Apple");
        System.out.println(movil.getMarca());

        movil = new EquipoMovilXiaomi();
        movil.setMarca("Xiaomi");
        System.out.println(movil.getMarca());

        movil = new EquipoMovilSamsung();
        movil.setMarca("Samsung");
        System.out.println(movil.getMarca());


    }

}

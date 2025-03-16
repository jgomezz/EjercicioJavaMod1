package pe.edu.tecsup.lab04._03.collections.list;

import java.util.ArrayList;
import java.util.List;

/*
 - auto 1 => modelo = "X001" , nombre ="Toyota"
 - auto 2 => modelo = "X002" , nombre ="Nissan"
 - auto 3 => modelo = "X003" , nombre ="Pegaut"

  - auto 4 => modelo = "X002" , nombre ="Nissan"


 */
public class Aplicacion {
    public static void main(String[] args) {

        // Se define coleccion de autos
        List<Auto> autos = new ArrayList<Auto>();
        autos.add(new Auto("X001","Toyota"));
        autos.add(new Auto("X002","Nissan"));
        autos.add(new Auto("X003","Pegout"));

        // Se define auto a buscar
        Auto auto4 = new Auto("X002","Nissan");

        //
        if(autos.contains(auto4)) {
            System.out.println(" El auto4 ESTA en la lista");
        } else {
            System.out.println(" El auto4 NO ESTA en la lista");

        }

    }

}

package pe.edu.tecsup.lab04._03.collections;

import java.util.ArrayList;
import java.util.Collection;

/*
    Crear una colección de dias de la semana, incluir "Feriado"
    Cuantos dias hay
    Luego eliminar feriado
    Verificar si el dia mi-ercoles esta en listado
 */
public class Aplicacion {


    public static void main(String[] args) {

        Collection<String> diasSemana = new ArrayList<String>();

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");
        diasSemana.add("Feriado");

        System.out.println(diasSemana);

        diasSemana.remove("Feriado");

        System.out.println(diasSemana);

        if (diasSemana.contains("Sabado")){
            System.out.println("El Sabado si esta incluido");
        }

    }

}

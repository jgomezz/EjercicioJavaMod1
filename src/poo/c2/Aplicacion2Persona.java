package poo.c2;

class Persona {

    String nombres;
    String apellido_materno;
    String apellido_paterno;
    String dni;

    int edad;
    char sexo;

}
public class Aplicacion2Persona {

    public static void main(String[] args) {

        Persona p1 =  new Persona();

        p1.nombres = "Alberto";
        p1.apellido_paterno = "Campos";

        System.out.println(p1.nombres);
        System.out.println(p1.apellido_paterno);
    }

}

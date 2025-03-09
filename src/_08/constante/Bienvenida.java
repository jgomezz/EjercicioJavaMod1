package _08.constante;

public class Bienvenida {

    public static final  String   SPANISH = "ES";
    public static final String ENGLISH = "EN";
    // public final static  String   ENGLISH = "EN";

    public static void saludar(String idioma){

        if (SPANISH.equals(idioma) ) {
            System.out.println("Buenos dias");
        } else if (ENGLISH.equals(idioma)) {
            System.out.println("Good morning") ;
        } else {
            System.out.println("Desconocido") ;
        }


    }

}

public class WhileBasico {

    static final int INIT = 50 ;
    static final int LIMIT_UP = 60 ;
    static final int STEP = 7;


    public static void main(String[] args) {

        // 20,21, ,...,29
        int contador = INIT ;

        while(contador <= LIMIT_UP ) {

            System.out.println("Cnt = " + contador);

            contador += STEP;

        }

        contador = INIT ;
        do{

            System.out.println("Cnt = " + contador);
            contador += STEP;

        } while (contador <= LIMIT_UP);



    }

}

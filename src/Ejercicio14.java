public class Ejercicio14 {

    static final int VALOR_INICIALIZACION = -1;

    public static void main(String[] args) {

        int nros[] = new int[10];

        // Inicializa
        for (int i = 0; i < nros.length; i++) {
            nros[i] = VALOR_INICIALIZACION;
        }

        System.out.println(nros);

        // Muestra valores
        for(int value : nros){
            System.out.println(value);
        }

        // Modifica valores
        int cnt = 3;
        for (int i = 0; i < nros.length; i++) {
            nros[i] = cnt;
            cnt += 3;
        }

        // Muestra valores
        for(int value : nros){
            System.out.println(value);
        }

        // Sumar valores
        int sum = 0;
        for (int i = 0; i < nros.length; i++) {
            sum = sum + nros[i] ;
        }

        System.out.println("Suma Total : " + sum);
    }

}

package poo.resumen;

public class Computadora {

    String tipoCpu;
    // Unidad de medida G
    int capacidadMemoriaRam;
    String potenciaFuenteEnergia;
    String tipoTarjetaVideo;
    // Unidad de medida GB
    int capacidadDiscoDuro;

    // Constructor vacio
    public Computadora(){
        System.out.println("Inicializando PC");
    }

    // Constructor con parametros
    public Computadora(String tipoCpu,
                       int capacidadMemoriaRam,
                       String potenciaFuenteEnergia,
                       String tipoTarjetaVideo,
                       int capacidadDiscoDuro) {
        this.tipoCpu = tipoCpu;
        this.capacidadMemoriaRam = capacidadMemoriaRam;
        this.potenciaFuenteEnergia = potenciaFuenteEnergia;
        this.tipoTarjetaVideo = tipoTarjetaVideo;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public void realizarCalculos(){
        String tipoTarjetaVideo = "Standard";

        System.out.println(" Realiza calculos");
        if(this.tipoTarjetaVideo.equals("GPU")) {
            System.out.println("Puedes realizar calculos para Big Data");
        } else {
            System.out.println("NO puedes realizar granades caclulos");
        }

    }

    /**
     *  Si la capacidad es mayor o igual  a 1 Tera, entonces
     *  tienes un supercomputador
     */
    public void almacenarDatos(){
        System.out.println("Almacenar datos");

        if( this.capacidadDiscoDuro >= 1024) {
            System.out.println("Tienes un supercomputador");
        } else {
            System.out.println("Te recomiendo que aumentes la capacidad de tu HHDD");
        }
    }

    public boolean ejecutarProgramas(String nombrePrograma){

        System.out.println("Evaluando ejecucion del programa");
        boolean resultado;

        if ( nombrePrograma.equals("Excel") && this.capacidadMemoriaRam > 8 ) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

}

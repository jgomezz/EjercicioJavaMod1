package poo.resumen;

public class Computadora {

    String tipoCpu;
    String capacidadMemoriaRam;
    String potenciaFuenteEnergia;
    String tipoTarjetaVideo;
    // Unidad GB
    int capacidadDiscoDuro;

    // Constructor vacio
    public Computadora(){
        System.out.println("Inicializando PC");
    }

    // Constructor con parametros
    public Computadora(String tipoCpu,
                       String capacidadMemoriaRam,
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
        System.out.println(" Realiza calculos");
        if(tipoTarjetaVideo.equals("GPU")) {
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

        if( capacidadDiscoDuro >= 1024) {
            System.out.println("Tienes un supercomputador");
        } else {
            System.out.println("Te recomiendo que aumentes la capacidad de tu HHDD");
        }
    }

    public void ejecutarProgramas(){
        System.out.println("Ejecutar programas");

    }

}

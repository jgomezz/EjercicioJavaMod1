package poo.resumen;

public class Computadora {

    String tipoCpu;
    String capacidadMemoriaRam;
    String potenciaFuenteEnergia;
    String tipoTarjetaVideo;
    String capacidadDiscoDuro;

    // Constructor vacio
    public Computadora(){
        System.out.println("Inicializando PC");
    }

    // Constructor con parametros
    public Computadora(String tipoCpu,
                       String capacidadMemoriaRam,
                       String potenciaFuenteEnergia,
                       String tipoTarjetaVideo,
                       String capacidadDiscoDuro) {
        this.tipoCpu = tipoCpu;
        this.capacidadMemoriaRam = capacidadMemoriaRam;
        this.potenciaFuenteEnergia = potenciaFuenteEnergia;
        this.tipoTarjetaVideo = tipoTarjetaVideo;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public void realizarCalculos(){
        System.out.println(" Realiza calculos");
    }

    public void almacenarDatos(){
        System.out.println("Almacenar datos");

    }

    public void ejecutarProgramas(){
        System.out.println("Ejecutar programas");

    }

}

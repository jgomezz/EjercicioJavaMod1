package pe.edu.tecsup.lab03._01.paquetes.ejercicio2.equipo;

public class EquipoMovilApple extends EquipoMovil{

    @Override
    public String obtenerInfo() {

        return super.getMarca();
        //return this.getMarca();

    }
}



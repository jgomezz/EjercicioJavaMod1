package pe.edu.tecsup._01.paquetes.ejercicio2.equipo;

public class EquuipoMovilApple extends EquipoMovil{

    @Override
    public String obtenerInfo() {

        return super.getMarca();
        //return this.getMarca();

    }
}



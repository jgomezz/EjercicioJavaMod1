package pe.edu.tecsup.lab03._05.interfaces.implementaciones.parciales;

public abstract class PersonaBase
        implements HabilidadCantar, HabilidadCorrer {

    protected String nombres;
    protected String apellidos;


    @Override
    public void canter() {
        System.out.println("Tengo habilidad para cantar");
    }
}

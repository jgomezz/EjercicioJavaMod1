package pe.edu.tecsup.lab04._03.collections.list;

import java.util.Objects;

public class Auto implements Comparable<Auto> {

    protected String modelo;
    protected String nombre;

    public Auto(String modelo, String nombre) {
        this.modelo = modelo;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto))
            return false;

        return  Objects.equals(modelo, auto.modelo) &&
                Objects.equals(nombre, auto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, nombre);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Auto auto) {
        return this.nombre.compareTo(auto.nombre);
    }
}

package com.terminal.terminal.Model;

import java.util.Objects;
/**
 * Clase que representa un objeto Pasajero.
 */
public class Pasajero {
    /**
     * Atributos de clase Pasajero.
     */
    private String id;
    private String nombre;
    private String apellido;
    /**
     * Constructor para crear un objeto Pasajero.
     *
     * @param id identificador del pasajero.
     * @param nombre nombre del pasajero.
     * @param apellido apellido del pasajero.
     */
    public Pasajero(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /**
     * Consultores y Modificares
     */
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que convierte un objeto Pasajero en su representación de cadena.
     * @return La representación de cadena del objeto Pasajero.
     */
    @Override
    public String toString() {
        return "Pasajero{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    /**
     * Método que compara si dos objetos Pasajero son iguales.
     * @param o El objeto a comparar con este objeto Pasajero.
     * @return Verdadero si los objetos son iguales, falso en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(id, pasajero.id) && Objects.equals(nombre, pasajero.nombre) && Objects.equals(apellido, pasajero.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido);
    }
}

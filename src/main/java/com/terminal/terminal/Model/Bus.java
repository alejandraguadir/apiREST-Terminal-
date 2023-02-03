package com.terminal.terminal.Model;
/**
 * Clase que representa un objeto Bus.
 */
public class Bus {
    /**
     * Atributos de clase Bus.
     */
    private String id;
    private String placa;
    private int capacidad;

    /**
     * Constructor de la clase Bus.
     * @param id Identificador único del objeto Bus.
     * @param placa Placa del objeto Bus.
     * @param capacidad Capacidad de pasajeros del objeto Bus.
     */

    public Bus(String id, String placa, int capacidad) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
    }
    /**
     * Consultores y Modificares
     */


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void disminuirPuestos(){
        this.capacidad --;
    }
    /**
     *  Método que convierte un objeto Bus en su representación de cadena.
     *  @return La representación de cadena del objeto Bus.
     */
    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}

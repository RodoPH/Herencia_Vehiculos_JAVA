//Realizado por RodoPH    152t0191@itsm.edu.mx
package principal2;

import javax.swing.JOptionPane;

public class Helicoptero extends Aereo {

    int altitud;
    Double precio;

    public Helicoptero(String modelo, String marca, int motor, int capacidad, int altitud, Double precio) {
        super(modelo, marca, motor, capacidad);
        this.altitud = altitud;
        this.precio = precio;

    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad 
                + "\nAltitud: " + altitud + " KM", "Datos del Helicoptero", 1);
    }

    public String verDatosString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad 
                + "\nAltitud: " + altitud +" KM" +"\nPrecio: $"+precio+ "Datos del Helicoptero";
    }

}

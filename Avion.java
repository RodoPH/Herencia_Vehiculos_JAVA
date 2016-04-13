//Realizado por RodoPH    152t0191@itsm.edu.mx
package principal2;

import javax.swing.JOptionPane;

public class Avion extends Aereo {

    int altitud;

    public Avion(String modelo, String marca, int motor, int capacidad, int altitud) {
        super(modelo, marca, motor, capacidad);
        this.altitud = altitud;

    }
    @Override
    public void verDatos(){
         JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad 
                + "\nAltitud: " +altitud +" KM","Datos del Avión", 1);
    }
    public String verDatosString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad + "\nColor: "
                + "\nAltitud: " +altitud +" KM"+ "Datos del Avión";
    }
}

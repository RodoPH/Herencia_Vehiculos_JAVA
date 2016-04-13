//Realizado por RodoPH    152t0191@itsm.edu.mx
package principal2;

import javax.swing.JOptionPane;

public class Barco extends Acuatico {

    String destino;

    public Barco(String modelo, String marca, int motor, int capacidad, String destino) {
        super(modelo, marca, motor, capacidad);
        this.destino = destino;

    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad 
                + "\nDestino: " + destino, "Datos del Barco", 1);
    }
    public String verDatosString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad + "\nColor: "
                + "\nDestino: " + destino + "Datos del Barco";

    }
}




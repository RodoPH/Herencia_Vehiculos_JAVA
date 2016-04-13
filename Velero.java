//Realizado por RodoPH    152t0191@itsm.edu.mx
package principal2;

import javax.swing.JOptionPane;

public class Velero extends Acuatico {

    String color;

    public Velero(String modelo, String marca, int motor, int capacidad, String color) {
        super(modelo, marca, motor, capacidad);
        this.color = color;

    }
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad + 
                 "\nColor: " + color, "Datos del velero", 1);
    }
    public String verDatosString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nCaballos de fuerza: " + motor + "\nCapacidad: " + capacidad + " personas"
                + "\nColor: " + color + "Datos del velero";

    }
}

//Realizado por RodoPH    152t0191@itsm.edu.mx
package principal2;


public class Principal2 {

   
    public static void main(String[] args) {
        
        //Asiganmos valores
        Velero vel = new Velero("Fast","Jumper",750,3,"Blanco");
        Barco bar1 = new Barco("HIU", "Titatic",36180,800,"Habana Cuba");
        Avion av1 = new Avion("MEX","AeroJet",400000,200,35000);
        Helicoptero heli = new Helicoptero("Heart","HeliCreate",38000,3,20000,456390.89);
        
        //Mostramos a pantalla los datos obtenidos
        vel.verDatos(); bar1.verDatos(); av1.verDatos();heli.verDatos( );
    }
    
}

package cl.lec;
import clases.Avion;
import clases.Camion;
import clases.Moto;
import clases.Vehiculo;
import java.util.ArrayList;
public class Proyectovehiculo {

    public static void main(String[] args) {
        Moto m1 = new Moto(180,"aftom","Susuki gs45",07/02/2022);
        Camion c1 = new Camion(300,"camion2","zx95",2004);
        Avion a1 = new Avion(25,"avion2","txz23",2005);
        Vehiculo v1 = new Vehiculo("hyundai rols","S402",06/07/2021);
              
        ArrayList<Vehiculo> clases = new ArrayList<Vehiculo>();
        clases.add(m1);
        clases.add(c1);
        clases.add(a1);
        clases.add(v1);
        
        for(int i = 0; i < clases.size(); i++){
            clases.get(i).getNombre();
            
        }
         
        
    }    
}

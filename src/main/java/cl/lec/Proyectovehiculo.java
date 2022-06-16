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
              
        ArrayList<Vehiculo> objetos = new ArrayList<>();
        objetos.add(m1);
        objetos.add(c1);
        objetos.add(a1);
        objetos.add(v1);
        
        for (int i = 0; i < objetos.size(); i++) {
            objetos.get(i).getNombre();
        }
         
        
    }    
}

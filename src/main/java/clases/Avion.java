package clases;
import interfaces.Acciones;
public class Avion extends Vehiculo implements Acciones{
    private int ocupantes;

    public Avion(int ocupantes, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.ocupantes = ocupantes;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }
    
        @Override
    public void encender(){
        System.out.println("estoy encendiendo el avion");
    }
    @Override
    public void frenar(){
        System.out.println("estoy frenando el avion");
}

    @Override
    public void apagar(){
        System.out.println("estoy apagando el avion");
}
    
}

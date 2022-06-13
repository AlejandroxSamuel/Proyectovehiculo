package clases;
import interfaces.Acciones;
public class Camion extends Vehiculo implements Acciones{
    private int pesoMaximo;

    public Camion(int pesoMaximo, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.pesoMaximo = pesoMaximo;
    }

 
    public int getpesoMaximo() {
        return pesoMaximo;
    }

    public void setpesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
    
    public void encender(){
        System.out.println("estoy encendiendo el camion");
    }
    
    public void frenar(){
        System.out.println("estoy frenando el camion");
}

    
    public void apagar(){
        System.out.println("estoy apagando el camion");
}
}

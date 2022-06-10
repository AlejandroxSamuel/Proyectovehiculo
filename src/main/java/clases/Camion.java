package clases;
import interfaces.Acciones;
public class Camion extends Vehiculo implements Acciones{
    private int pesoMaximo;

    public Camion(int pesoMaximo, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.pesoMaximo = pesoMaximo;
    }

    public int getpesoMaximo() {
        return pesoMaximo;
    }

    public void setpesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
    @Override
    public void encender(){
        System.out.println("estoy encendiendo el camion");
    }
    @Override
    public void frenar(){
        System.out.println("estoy frenando el camion");
}

    @Override
    public void apagar(){
        System.out.println("estoy apagando el camion");
}
}

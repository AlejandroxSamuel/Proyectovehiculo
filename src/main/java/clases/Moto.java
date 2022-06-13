package clases;
import interfaces.Acciones;
public class Moto extends Vehiculo implements Acciones{
    private int VelocidadMaxima;

    public Moto(int VelocidadMaxima, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }
     @Override
    public void encender(){
        System.out.println("La moto esta encendida");
    }
    @Override
    public void frenar(){
        System.out.println("La moto esta frenando");
}

    @Override
    public void apagar(){
        System.out.println("La moto esta apagada");
}
}

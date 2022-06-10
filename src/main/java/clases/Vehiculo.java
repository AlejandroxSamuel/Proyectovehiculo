package clases;
public class Vehiculo {
    protected String nombre;
    protected  String modelo;
    protected int anioFabricacion;
    
    public Vehiculo(String nombre, String modelo, int anioFabricacion) { 
        this.nombre = nombre;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    } 
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
        
    }       

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

   
    
}


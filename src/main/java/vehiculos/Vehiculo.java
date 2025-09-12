package vehiculos;

public class Vehiculo {
    protected double velocidadMaxima;
    protected String marca;
    public Vehiculo(String marca, double velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + "\nVelocidad maxima: " + velocidadMaxima);
    }
}
package vehiculos;

public class Coche extends Vehiculo{
    protected int numeroPuertas;
    public Coche(String marca, double velocidadMaxima, int numeroPuertas){
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
    public void cocheInfo(){
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }

    public static void main(String[] args) {
        var vehiculo = new Vehiculo("Toyota", 120.5);
        vehiculo.mostrarInfo();
        System.out.println("-------------------");
        Coche coche = new Coche("Ford", 220, 4);
        coche.cocheInfo();
    }
}
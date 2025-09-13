package empleados;

public class Empleado {
    protected String nombre;
    private double salario;
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + "\nSalario: " + salario);
    }
}
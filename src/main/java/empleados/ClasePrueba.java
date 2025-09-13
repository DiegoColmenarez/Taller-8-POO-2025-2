package empleados;

public class ClasePrueba {
    public static void main(String[] args) {
        var empleado = new Empleado("Ivan",777);
        empleado.mostrarInformacion();
        System.out.println("------------------");
        var gerente = new Gerente("Ana", 1000, "Ventas");
        gerente.mostrarInformacion();

        Jefe jefe = new Jefe("Carlos", 7777, 1234);
        //jefe.mostrar();
    }
}
package empleados;
/**
public class Jefe extends Empleado, Gerente{
    private int clavesAcceso;
    public Jefe(String nombre, double salario, String departamento, int clavesAcceso){
        super(nombre, salario, departamento);
        this.clavesAcceso = clavesAcceso;
    }
}**/
public class Jefe extends Empleado {
    private int clavesAcceso;
    public Jefe(String nombre, double salario, int clavesAcceso) {
        super(nombre, salario);
        this.clavesAcceso = clavesAcceso;
    }
     public void mostrar(){
        //System.out.println("salario: " + salario);
     }
}
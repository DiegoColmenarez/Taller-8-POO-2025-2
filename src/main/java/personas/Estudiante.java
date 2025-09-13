package personas;

public class Estudiante extends Persona {
    private double matricula;
    public Estudiante(String nombre, int edad, double matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }
    public void detallesEstudiante(){
        super.mostrarDetalles();
        System.out.println("Matricula: " + matricula);
    }
}
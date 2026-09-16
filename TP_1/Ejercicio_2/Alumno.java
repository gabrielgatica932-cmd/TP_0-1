package Ejercicio_2;
public class Alumno extends Persona {
    
    private String legajo;
    private float promedio;
    
    public Alumno (String nombre, String dni, String legajo, float promedio) {
        super(nombre, dni);
        this.legajo = legajo;
        this.promedio = promedio;
    }

    public String getLegajo() {
        return legajo;
    }
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println("--- Datos del Alumno ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Promedio: " + this.promedio);
        System.out.println();
    }
}

package Ejercicio_3;

public abstract class Empleado {
    
    private String nombre;
    private String legajo;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getLegajo() { return legajo; }
    public void setLegajo(String legajo) { this.legajo = legajo; }
}

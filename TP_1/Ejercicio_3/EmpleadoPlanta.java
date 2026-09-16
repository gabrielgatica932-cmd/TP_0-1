package Ejercicio_3;

public class EmpleadoPlanta extends Empleado{
    
    private double sueldoBase;
    private int antiguedadAnios;

    public EmpleadoPlanta(String nombre, String legajo, double sueldoBase, int antiguedadAnios) {
        super(nombre, legajo);
        this.sueldoBase = sueldoBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * 0.02 * antiguedadAnios);
    }
}

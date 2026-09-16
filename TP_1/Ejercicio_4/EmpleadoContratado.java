package Ejercicio_4;

public class EmpleadoContratado extends Empleado {
    
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoContratado(String nombre, String legajo, int horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

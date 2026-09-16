package Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        
        
        EmpleadoPlanta empPlanta = new EmpleadoPlanta("Lorena Gomez", "EP-101", 500000.0, 5);
        
        EmpleadoContratado empContratado = new EmpleadoContratado("Marcos Diaz", "EC-202", 160, 3500.0);
        
        System.out.println("--- SISTEMA DE LIQUIDACIÓN DE SUELDOS ---");
        
        System.out.println("Empleado de Planta: " + empPlanta.getNombre());
        System.out.println("Legajo: " + empPlanta.getLegajo());
        System.out.println("Sueldo Liquidado: $" + empPlanta.calcularSueldo());
        System.out.println("-----------------------------------------");

        System.out.println("Empleado Contratado: " + empContratado.getNombre());
        System.out.println("Legajo: " + empContratado.getLegajo());
        System.out.println("Sueldo Liquidado: $" + empContratado.calcularSueldo());
        System.out.println("-----------------------------------------");
    }
}

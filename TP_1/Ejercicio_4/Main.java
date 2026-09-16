package Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        
        Empleado[] nominaEmpleados = new Empleado[3];
        
        nominaEmpleados[0] = new EmpleadoPlanta("Lorena Gomez", "EP-101", 500000.0, 5);
        nominaEmpleados[1] = new EmpleadoContratado("Marcos Diaz", "EC-202", 160, 3500.0);
        nominaEmpleados[2] = new EmpleadoPlanta("Esteban Quito", "EP-102", 600000.0, 2);
        
        System.out.println("--- REPORTE GENERAL DE SUELDOS (POLIMORFISMO) ---");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < nominaEmpleados.length; i++) {
            if (nominaEmpleados[i] != null) {
                System.out.println("Empleado: " + nominaEmpleados[i].getNombre());
                System.out.println("Sueldo: $" + nominaEmpleados[i].calcularSueldo());
                System.out.println("-------------------------------------------------");
            }
        }
    }
}

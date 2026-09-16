package Ejercicio_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Vehiculo[] flota = new Vehiculo[4];

        // 2. Cargar los distintos tipos de vehículos usando polimorfismo
        flota[0] = new Auto("Toyota", "Corolla", "AE123DD", 35000);
        flota[1] = new Motocicleta("Honda", "Wave", "A987XYZ", 15000);
        flota[2] = new AutoElectricico("Nissan", "Leaf", "AF456EE", 45000, 8000);
        flota[3] = new Camioneta("Ford", "Ranger", "AD789CC", 55000);

        System.out.print("Ingrese la cantidad de días para el alquiler: ");
        int diasAlquiler = teclado.nextInt();

        System.out.println("\n=================================================");
        System.out.println("       PRESUPUESTO DE ALQUILER POR " + diasAlquiler + " DÍAS");
        System.out.println("=================================================");

        for (int i = 0; i < flota.length; i++) {
            if (flota[i] != null) {
                System.out.println("Vehículo: " + flota[i].getMarca() + " " + flota[i].getModelo() + " [" + flota[i].getPatente() + "]");
                System.out.println("Costo Total: $" + flota[i].calcularAlquiler(diasAlquiler));
                System.out.println("-------------------------------------------------");
            }
        }
        System.out.println("=================================================");
        teclado.close();
    }
}
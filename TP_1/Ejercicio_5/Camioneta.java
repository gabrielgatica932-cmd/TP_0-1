package Ejercicio_5;

public class Camioneta extends Vehiculo {

    private double tarifaPorDia;

    public Camioneta(String marca, String modelo, String patente, double tarifaPorDia) {
        super(marca, modelo, patente);
        this.tarifaPorDia = tarifaPorDia;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return tarifaPorDia * dias * 1.20;
    }
}
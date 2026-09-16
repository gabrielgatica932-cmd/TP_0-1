package Ejercicio_5;

public class Motocicleta extends Vehiculo {

    private double tarifaPorDia;

    public Motocicleta(String marca, String modelo, String patente, double tarifaPorDia) {
        super(marca, modelo, patente);
        this.tarifaPorDia = tarifaPorDia;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (tarifaPorDia * dias) * 0.90;
    }
}
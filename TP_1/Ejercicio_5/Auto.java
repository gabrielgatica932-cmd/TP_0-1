package Ejercicio_5;

public class Auto extends Vehiculo {
    
    private double tarifaPorDia;

    public Auto(String marca, String modelo, String patente, double tarifaPorDia) {
        super(marca, modelo, patente);
        this.tarifaPorDia = tarifaPorDia;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return tarifaPorDia * dias;
    }
}
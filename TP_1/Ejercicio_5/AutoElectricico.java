package Ejercicio_5;

public class AutoElectricico extends Vehiculo {
    
    private double tarifaPorDia;
    private double costoCargaBateria;

    public AutoElectricico(String marca, String modelo, String patente, double tarifaPorDia, double costoCargaBateria) {
        super(marca, modelo, patente);
        this.tarifaPorDia = tarifaPorDia;
        this.costoCargaBateria = costoCargaBateria;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (tarifaPorDia * dias) + costoCargaBateria;
    }
}
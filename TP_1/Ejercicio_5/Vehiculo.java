package Ejercicio_5;

public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public abstract double calcularAlquiler(int dias);

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
}
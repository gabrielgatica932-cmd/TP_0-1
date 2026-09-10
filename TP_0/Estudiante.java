public class Estudiante {

    String nombre;
    String apellido;
    int edad;
    String carrera;
    float promedio;

    public Estudiante(String nombre, String apellido, int edad, String carrera, float promedio) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;

    }

    public boolean esAprobado() {
        return this.promedio > 6;
    }

    public Estudiante() {
    }
}
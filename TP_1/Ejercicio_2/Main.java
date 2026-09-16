package Ejercicio_2;

public class Main {

    public static void main(String[] args) {
        Alumno alum1 = new Alumno("Sandra", "42854954", "234285495442", 8.4f);
        Alumno alum2 = new Alumno("Carlos", "43858151", "144385815144", 5.9f);
        Alumno alum3 = new Alumno("Marisa", "42169555", "164216955590", 3.1f);
        Alumno alum4 = new Alumno("Marcos", "41933163", "534193316314", 9.2f);

        alum1.mostrarDatos();
        alum2.mostrarDatos();
        alum3.mostrarDatos();
        alum4.mostrarDatos();
    }
}

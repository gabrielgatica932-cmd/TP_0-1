package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        
        Carrera carrera = new Carrera("Programador Universitario en Sistemas", 101, 5);
        System.out.println("--- Carrera creada: " + carrera.getNombre() + " ---");
        System.out.println();

        Estudiante est1 = new Estudiante("Juan", "Perez", 20, 3);
        Estudiante est2 = new Estudiante("Maria", "Gomez", 22, 3);
        Estudiante est3 = new Estudiante("Roberto", "Gatica",19, 3);
        Estudiante est4 = new Estudiante("Sofia", "Garro", 24, 3);
        Estudiante est5 = new Estudiante("Miguel", "Calderón", 20, 3);

        carrera.agregarEstudiante(est1);
        carrera.agregarEstudiante(est2);
        carrera.agregarEstudiante(est3);
        carrera.agregarEstudiante(est4);
        carrera.agregarEstudiante(est5);
        System.out.println();

        Materia mat1 = new Materia("Programacion I", 1, 6);
        mat1.setCalificacion(8.5f);

        Materia mat2 = new Materia("Base de Datos", 2, 4);
        mat2.setCalificacion(9.0f);

        Materia mat3 = new Materia("Matematica", 3, 5);
        mat3.setCalificacion(7.0f);

        Materia mat4 = new Materia("Sistemas Operativos", 4, 4);
        mat4.setCalificacion(10.0f);

        est1.agregarMateria(mat1);
        est1.agregarMateria(mat2);
        est1.agregarMateria(mat4);
        System.out.println();
        est2.agregarMateria(mat3);
        est2.agregarMateria(mat4);
        est2.agregarMateria(mat1);
        System.out.println();
        est3.agregarMateria(mat2);
        est3.agregarMateria(mat4);
        est3.agregarMateria(mat3);
        System.out.println();
        est4.agregarMateria(mat1);
        est4.agregarMateria(mat4);
        est4.agregarMateria(mat2);
        System.out.println();
        est5.agregarMateria(mat3);
        est5.agregarMateria(mat2);
        est5.agregarMateria(mat1);
        System.out.println();

        est1.setPromedio(est1.calcularPromedio());
        est2.setPromedio(est2.calcularPromedio());
        est3.setPromedio(est2.calcularPromedio());
        est4.setPromedio(est2.calcularPromedio());
        est5.setPromedio(est2.calcularPromedio());
        System.out.println();

        System.out.println("--- Promedios Calculados ---");
        System.out.println("Promedio de " + est1.getNombre() + ": " + est1.getPromedio());
        System.out.println("Promedio de " + est2.getNombre() + ": " + est2.getPromedio());
        System.out.println("Promedio de " + est3.getNombre() + ": " + est3.getPromedio());
        System.out.println("Promedio de " + est4.getNombre() + ": " + est4.getPromedio());
        System.out.println("Promedio de " + est5.getNombre() + ": " + est5.getPromedio());
        System.out.println();

        carrera.listarEstudiantes();
    }
}

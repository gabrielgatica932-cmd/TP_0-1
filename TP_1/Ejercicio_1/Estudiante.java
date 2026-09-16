package Ejercicio_1;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private float promedio;
    private Materia[] materias;

    public Estudiante(String nombre, String apellido, int edad, int cantidadMaterias) {
    this.nombre = nombre;
    this.apellido = apellido;
    setEdad(edad);
    this.materias = new Materia[10];
}

    //Atributo: Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    //Atributo: Apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.nombre = apellido;
        } else {
            System.out.println("El apellido no puede estar vacío.");
        }
    }

    //Atributo: Edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            System.out.println("La edad de ser superio a 16.");
        }
    }

    //Atributo: Promedio
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0 y 10.");
        }
    }

    //Atributo: Materias
    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    //Método: Agregar tarea
    public void agregarMateria(Materia materia) {
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] == null) {
                materias[i] = materia;
                System.out.println("Materia '" + materia.getNombre() + "' agregada con éxito a " + this.nombre + ".");
                break;
            }
        }   
    }

    public float calcularPromedio() {

        float sumaCalificaciones = 0;
        int contMaterias = 0;

        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                sumaCalificaciones += materias[i].getCalificacion();
                contMaterias++;
            }
        }

        if (contMaterias == 0) {
            return 0;
        }

        return sumaCalificaciones / contMaterias;
    }
}
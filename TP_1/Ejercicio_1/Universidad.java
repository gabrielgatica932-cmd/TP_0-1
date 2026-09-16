package Ejercicio_1;
public class Universidad {
    
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    public Universidad(String nombre, String direccion, int capacidadMaximaEstudiantes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new Estudiante[capacidadMaximaEstudiantes];
    }

    //Atributo: Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Atributo: Dirección
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Atributo: Estudiantes
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}
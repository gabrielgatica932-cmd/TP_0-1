package Ejercicio_1;

public class Carrera {
    
    private String nombre;
    private int codigo;
    private Estudiante[] estudiantes;

    public Carrera(String nombre, int codigo, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new Estudiante[50];
    }
    
    //Atributo: Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    //Atributo: Código
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    //Atributo: Estudiantes
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    //Método: Agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = estudiante;
                System.out.println("Estudiante " + estudiante.getNombre() + " " + estudiante.getApellido() + " inscrito con éxito en la carrera.");
                return;
            } 
        }
        System.out.println("No hay más cupo en esta carrera.");
    }

    //Método: Listar estudiantes

    public void listarEstudiantes() {
        System.out.println("--- Lista de Estudiantes inscritos ---");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("- " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido());
            }
        }
    }

    public Estudiante buscarEstudiante(String nombreBuscar) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
                return estudiantes[i];
            }
        }
        System.out.println("Estudiante '" + nombreBuscar + "' no encontrado.");
        return null;
    } 
}
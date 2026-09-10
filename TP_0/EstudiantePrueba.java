public class EstudiantePrueba {
    String nombre;
    String apellido;
    int edad;
    int dni;
    String carrera;

    public EstudiantePrueba(String nombre, String apellido, int edad, int dni, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.carrera = carrera;
    } //Con parámetros

    public EstudiantePrueba() {
    } // Sin parámetros
    
    //Con parámetros
    EstudiantePrueba estudiante1 = new EstudiantePrueba("Gabriel", "Gatica", 24, 43954023, "Programador");
    
    public void main() { // Para mostrar los datos sin parámetros, tienen que ir dentro del método main.
        EstudiantePrueba estudiante2 = new EstudiantePrueba();
        estudiante2.nombre = "Mateo";
        estudiante2.apellido = "López";
        estudiante2.edad = 22;
        estudiante2.dni = 4156252;
        estudiante2.carrera = "Diseñador";
    }
    
}
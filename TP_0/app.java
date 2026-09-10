import java.util.Scanner; //Importación de la clase Scanner para poder leer datos desde la consola.

public class app {
    
    //throws Exeption: Esta función hace que, si ocurre un error, el programa no se va a cerrar, sino que va a mostrar el error y va a seguir ejecutando el programa.
    public static void main(String[] Datos) throws Exception {

        Scanner scanner = new Scanner(System.in); //Creación de un objeto de la clase Scanner para poder leer datos desde la consola.

        //Creación de objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Roberto", "López", 22, "Programador", 8.5f);
        Estudiante estudiante2 = new Estudiante("Nahuel", "García", 20, "Diseñador", 3.8f);
        Estudiante estudiante3 = new Estudiante("Ana", "Martínez", 21, "Ingeniera", 5.2f);
        Estudiante estudiante4 = new Estudiante("Carlos", "Rodríguez", 19, "Arquitecto", 8.0f);
        Estudiante estudiante5 = new Estudiante(); {
            estudiante5.nombre = "Marta";
            estudiante5.apellido = "González";
            estudiante5.edad = 23;
            estudiante5.carrera = "Abogada";
            estudiante5.promedio = 9.1f;
        }

        
        
        
        
        //Muestra de los datos de los estudiantes
        float promedioGeneral = 0;

        Estudiante[] estudiante = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5}; //Creación de un arreglo de objetos de la clase Estudiante
        System.out.println("--------------------------------------------------");
        System.out.println("INFORMACIÓN DE LOS ESTUDIANTES");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < estudiante.length; i++) { //lenght: Devuelve la cantidad de elementos que tiene un arreglo.
            System.out.println("\nEstudiante " + (i + 1)+ "\n");
            System.out.println("Nombre: " + estudiante[i].nombre);
            System.out.println("Apellido: " + estudiante[i].apellido);
            System.out.println("Edad: " + estudiante[i].edad);
            System.out.println("Carrera: " + estudiante[i].carrera);
            System.out.println("Promedio: " + estudiante[i].promedio);
            System.out.println("\n--------------------------------------------------");
        }
        
        
        
        
        
        //Promedio general del curso
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("PROMEDIO GENERAL DEL CURSO");
        System.out.println("--------------------------------------------------\n");
        float promedioSuma = 0;
        for (int i = 0; i < estudiante.length; i++) {   
            System.out.println("Promedio del estudiante " + (i + 1) + ": " + estudiante[i].promedio);
            promedioSuma += estudiante[i].promedio; //Suma de los promedios de los estudiantes
        }
        promedioGeneral = promedioSuma / estudiante.length; //Cálculo del promedio general
        System.out.println("\nLa suma de los promedios de los estudiantes es: " + promedioSuma);
        System.out.println("\nPromedio general del curso: " + promedioGeneral);
        System.out.println("\n--------------------------------------------------");

        
        
        
        
        //Mejor promedio del curso
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("MEJOR PROMEDIO DEL CURSO");
        System.out.println("--------------------------------------------------");
        float mejorPromedio = estudiante[0].promedio;
        String mejorEstudiante = estudiante[0].nombre + " " + estudiante[0].apellido;
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].promedio > mejorPromedio) {
                mejorPromedio = estudiante[i].promedio;
                mejorEstudiante = estudiante[i].nombre + " " + estudiante[i].apellido;
            }

        }
        System.out.println("\nEl/la estudiante con el mejor promedio es " + mejorEstudiante + " con un promedio de " + mejorPromedio);
        System.out.println("\n--------------------------------------------------");


        
        
        
        //Estudiantes aprobados del curso
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("ESTUDIANTES APROBADOS DEL CURSO");
        System.out.println("--------------------------------------------------\n");
        int estudiantesAprobados = 0;
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].promedio > 6) {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " ha aprobado con un promedio de: " + estudiante[i].promedio);
                estudiantesAprobados++;
            }
        }
        System.out.println("\nNúmero de estudiantes aprobados: " + estudiantesAprobados);
        System.out.println("\n--------------------------------------------------");





        //Buscar estudiante por nombre
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("BUSCAR ESTUDIANTE POR NOMBRE");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Ingrese el nombre del estudiante que desea buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;
        System.out.println("");
        for (int i = 0; i < estudiante.length; i++) {
            //equalsIgnoreCase: Compara dos cadenas de texto sin importar si están en mayúsculas o minúsculas.
            if (estudiante[i].nombre.equalsIgnoreCase(nombreBuscado)) { 
                encontrado = true;
                System.out.println("\nEstudiante encontrado: \n");
                System.out.println("Nombre: " + estudiante[i].nombre);
                System.out.println("Apellido: " + estudiante[i].apellido);
                System.out.println("Edad: " + estudiante[i].edad);
                System.out.println("Carrera: " + estudiante[i].carrera);
                System.out.println("Promedio: " + estudiante[i].promedio);
                System.out.println("Estado: " + encontrado);
            }
        }
        if (!encontrado) {
                System.out.println("\nEl/la estudiante " + nombreBuscado + " no se ha encontrado");
        }
        System.out.println("\n--------------------------------------------------");





        //Clasificaión según promedio
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("CLASIFICACIÓN SEGÚN PROMEDIO");
        System.out.println("--------------------------------------------------\n");
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].promedio >= 9) {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " tiene un promedio excelente de: " + estudiante[i].promedio);
            } else if (estudiante[i].promedio >= 7) {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " tiene un promedio bueno de: " + estudiante[i].promedio);
            } else if (estudiante[i].promedio >= 5) {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " tiene un promedio regular de: " + estudiante[i].promedio);
            } else {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " tiene un promedio insuficiente de: " + estudiante[i].promedio);
            }
        }
        System.out.println("\n--------------------------------------------------");





        //Determinar condición de los estudiantes
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("CONDICIÓN DE LOS ESTUDIANTES");
        System.out.println("--------------------------------------------------\n");
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].esAprobado()) {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " ha aprobado con un promedio de: " + estudiante[i].promedio);
            } else {
                System.out.println("El/la estudiante " + estudiante[i].nombre + " " + estudiante[i].apellido + " ha desaprobado con un promedio de: " + estudiante[i].promedio);
            }
        }
        System.out.println("\n--------------------------------------------------");

    }

}

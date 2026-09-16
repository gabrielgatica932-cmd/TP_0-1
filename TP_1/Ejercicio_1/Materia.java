package Ejercicio_1;
public class Materia {
    
    private String nombre;
    private int codigo;
    private int creditos;
    private float calificacion; 

    public Materia(String nombre, int codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = 0;
    }
    
    //Atributo: Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Atributo: Codigo
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Atributo: Creditos
    public int getCreditos(){
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    //Atributo: Calificación
    public float getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
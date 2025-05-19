/**
 * Clase abstracta base para cualquier tipo de trabajador.
 */
public abstract class Trabajador {
    // Atributos comunes a todos los trabajadores
    protected String nombre;
    protected String apellidos;
    protected double sueldoMensual;
    protected String departamento;
    protected int edad;

    // Constructor: se usa para dar valor a los atributos cuando se crea el objeto
    public Trabajador(String nombre, String apellidos, double sueldoMensual, String departamento, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoMensual = sueldoMensual;
        this.departamento = departamento;
        this.edad = edad;
    }

    // Método abstracto: las clases hijas deben implementarlo obligatoriamente
    public abstract double calcularSueldoMensual();

    // Método toString: sirve para mostrar información del trabajador como texto
    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + departamento + ") - Edad: " + edad;
    }
}

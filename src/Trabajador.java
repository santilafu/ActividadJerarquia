// Trabajador.java

/**
 * Clase abstracta que representa a un trabajador de la empresa.
 */
public abstract class Trabajador {
    protected String nombre;
    protected String apellidos;
    protected double sueldoMensual;
    protected String departamento;
    protected int edad;

    public Trabajador(String nombre, String apellidos, double sueldoMensual, String departamento, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoMensual = sueldoMensual;
        this.departamento = departamento;
        this.edad = edad;
    }

    public abstract double calcularSueldoMensual();

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + departamento + ") - Edad: " + edad;
    }
}

// Empleado.java

/**
 * Clase que representa a un empleado normal, con antigüedad.
 */
public class Empleado extends Trabajador {
    private int antigüedad;

    public Empleado(String nombre, String apellidos, double sueldoMensual, String departamento, int edad, int antigüedad) {
        super(nombre, apellidos, sueldoMensual, departamento, edad);
        this.antigüedad = antigüedad;
    }

    @Override
    public double calcularSueldoMensual() {
        return sueldoMensual + (antigüedad * 20); // Por ejemplo: 20€ extra por año de antigüedad
    }

    @Override
    public String toString() {
        return super.toString() + " - Empleado con " + antigüedad + " años de antigüedad";
    }
}

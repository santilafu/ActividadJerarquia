// Directivo.java

/**
 * Clase que representa a un directivo, con bonus mensual.
 */
public class Directivo extends Trabajador {
    private double bonus;

    public Directivo(String nombre, String apellidos, double sueldoMensual, String departamento, int edad, double bonus) {
        super(nombre, apellidos, sueldoMensual, departamento, edad);
        this.bonus = bonus;
    }

    @Override
    public double calcularSueldoMensual() {
        return sueldoMensual + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " - Directivo con bonus de " + bonus + "€";
    }
}

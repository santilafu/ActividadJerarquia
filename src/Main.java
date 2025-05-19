/**
 * Clase principal que crea y muestra trabajadores.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Empleado
        Trabajador empleado = new Empleado("Lucía", "Pérez", 1200, "Ventas", 30, 5);

        // Creamos un objeto de tipo Directivo
        Trabajador directivo = new Directivo("Carlos", "Gómez", 2000, "Dirección", 45, 500);

        // Mostramos la información del empleado
        System.out.println(empleado.toString());
        System.out.println("Sueldo total: " + empleado.calcularSueldoMensual() + "€\n");

        // Mostramos la información del directivo
        System.out.println(directivo.toString());
        System.out.println("Sueldo total: " + directivo.calcularSueldoMensual() + "€");
    }
}

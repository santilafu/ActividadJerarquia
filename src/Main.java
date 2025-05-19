// Main.java

public class Main {
    public static void main(String[] args) {
        Trabajador t1 = new Empleado("Lucía", "Pérez", 1200, "Ventas", 30, 5);
        Trabajador t2 = new Directivo("Carlos", "Gómez", 2000, "Dirección", 45, 500);

        System.out.println(t1.toString());
        System.out.println("Sueldo total: " + t1.calcularSueldoMensual() + "€\n");

        System.out.println(t2.toString());
        System.out.println("Sueldo total: " + t2.calcularSueldoMensual() + "€");
    }
}

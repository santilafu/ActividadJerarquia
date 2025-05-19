# Actividad 1 - Jerarquía de Trabajadores

📚 Proyecto de la Unidad 7 de Programación - 1º DAM  
👨‍💻 Desarrollado en Java utilizando IntelliJ IDEA

## 🧠 Descripción

Este proyecto consiste en crear una jerarquía de clases que representa diferentes tipos de trabajadores de una empresa. Se ha trabajado con **herencia**, **clases abstractas**, y **sobreescritura de métodos**, aplicando los principios de la programación orientada a objetos (POO).

## 🧩 Estructura de Clases

- `Trabajador` (clase abstracta):  
  Atributos comunes como `nombre`, `apellidos`, `sueldoMensual`, `departamento`, `edad`.  
  Contiene el método abstracto `calcularSueldoMensual()`.

- `Empleado`:  
  Subclase de `Trabajador` que incluye `antigüedad` y calcula el sueldo en base a ella.

- `Directivo`:  
  Subclase de `Trabajador` que incluye un `bonus` mensual.

- `Main`:  
  Clase principal para probar el funcionamiento y mostrar resultados por consola.

## ⚙️ Ejemplo de ejecución

```java
Empleado e = new Empleado("Lucía", "Pérez", 1200, "Ventas", 30, 5);
Directivo d = new Directivo("Carlos", "Gómez", 2000, "Dirección", 45, 500);

System.out.println(e.toString());
System.out.println("Sueldo total: " + e.calcularSueldoMensual() + "€");

System.out.println(d.toString());
System.out.println("Sueldo total: " + d.calcularSueldoMensual() + "€");

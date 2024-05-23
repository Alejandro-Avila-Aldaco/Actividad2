import java.util.Scanner;

public class Actividad2 {
     String nombre;
     int[] calificaciones;

    public Actividad2(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / (double) calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) return 'F';
        if (promedio <= 60) return 'E';
        if (promedio <= 70) return 'D';
        if (promedio <= 80) return 'C';
        if (promedio <= 90) return 'B';
        return 'A';
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer calificaciones
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Ingrese la calificación " + (i + 1) + " (0-100): ");
                int calificacion = scanner.nextInt();
                if (calificacion >= 0 && calificacion <= 100) {
                    calificaciones[i] = calificacion;
                    break;
                } else {
                    System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
                }
            }
        }

        // Crear instancia de Actividad2 y mostrar resultados
        Actividad2 estudiante = new Actividad2("Alejandro Avila", calificaciones);
        estudiante.imprimirResultados();

        scanner.close();
    }
}




import java.util.Scanner;

public class Proupesto_23_cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes a, b y c de la ecuación cuadrática ax^2 + bx + c = 0:");

        // Leer los coeficientes
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = B * B - 4 * A * C;

        // Calcular las raíces
        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las raíces son reales y diferentes:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            System.out.println("La raíz es real y doble:");
            System.out.println("x = " + x);
        } else {
            System.out.println("No hay raíces reales.");
        }

        scanner.close();
    }
}


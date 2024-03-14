import java.util.Scanner;

public class Propuesto_24_cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A tiene el mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B tiene el mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C tiene el mayor peso.");
        } else {
            System.out.println("Hay dos o más esferas con el mismo peso máximo.");
        }

        scanner.close();
    }
}


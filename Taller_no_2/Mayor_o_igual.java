import java.util.Scanner;

public class Mayor_o_igual {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero A:");
        Double numeroA = scanner.nextDouble();
        System.out.println("Por favor, introduce un numero B:");
        Double numeroB = scanner.nextDouble();
        scanner.close();
        Mayor_igual_menor(numeroA, numeroB);
    }

    public static void Mayor_igual_menor(double A, double B){
        if (A > B){
            System.out.println("A es mayor que B");
        }
        else if (A < B){
            System.out.println("A es menor que B");
        }
        else{
            System.out.println("A es igual que B");
        }
    }
}

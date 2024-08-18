import java.util.Scanner;
import java.util.Arrays;

public class Mayor_numero_entero {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un numero A:");
        int numeroA = scanner.nextInt();
        System.out.println("Por favor, introduce un numero B:");
        int numeroB = scanner.nextInt();
        System.out.println("Por favor, introduce un numero C:");
        int numeroC = scanner.nextInt();
        mayor(numeroA, numeroB, numeroC);
        scanner.close();
    }

    public static void mayor(int A, int B, int C){
        int[] lista = {A,B,C};
        int maximo = Arrays.stream(lista).max().getAsInt();
        System.out.println("El máximo número es: " + maximo);
    }
}

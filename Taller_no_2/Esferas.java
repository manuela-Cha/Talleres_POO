import java.util.Scanner;
public class Esferas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso de la esfera A: ");
        Double esfera_A = scanner.nextDouble();
        System.out.println("Peso de la esfera B: ");
        Double esfera_B = scanner.nextDouble(); 
        System.out.println("Peso de la esfera C: ");
        Double esfera_C = scanner.nextDouble();  
        System.out.println("Peso de la esfera D: ");
        Double esfera_D = scanner.nextDouble();
        scanner.close();

        String diferente = "";
        String mayor_o_menor = "";

        if (esfera_A.equals(esfera_D) && esfera_A.equals(esfera_B)){
            diferente = "esfera C";
            if (esfera_C > esfera_B){
                mayor_o_menor = "mayor";
            }
            else{
                mayor_o_menor = "menor";
            }
        }
        if (esfera_A.equals(esfera_C) && esfera_A.equals(esfera_B)){
            diferente = "esfera D";
            if (esfera_D > esfera_B){
                mayor_o_menor = "mayor";
            }
            else{
                mayor_o_menor = "menor";
            }
        }
        if (esfera_A.equals(esfera_D) && esfera_A.equals(esfera_C)){
            diferente = "esfera B";
            if (esfera_B > esfera_A){
                mayor_o_menor = "mayor";
            }
            else{
                mayor_o_menor = "menor";
            }
        }
        if (esfera_B.equals(esfera_D) && esfera_A.equals(esfera_C)){
            diferente = "esfera A";
            if (esfera_A > esfera_B){
                mayor_o_menor = "mayor";
            }
            else{
                mayor_o_menor = "menor";
            }
        }
        System.out.println("La esfera diferente es la "+diferente + " y tiene un valor "+ mayor_o_menor);
    }
}

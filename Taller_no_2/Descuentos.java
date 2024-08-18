import java.util.Scanner;
public class Descuentos {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor total de la compra:");
        float valor_compra = scanner.nextFloat();
        System.out.println("ingrese el color de la bolita: ");
        String color_bola = scanner.next();
        scanner.close();

        calculo_de_descuento(valor_compra, color_bola);
    }
    public static void calculo_de_descuento(float valor_compra, String color_bola){
        float valor_neto_a_pagar;
        float descuento;
        if (color_bola .equals("blanca")){
            valor_neto_a_pagar = valor_compra; 
        }
        else if (color_bola .equals("verde")){
            descuento = (float) 0.1;
            valor_neto_a_pagar = valor_compra - (valor_compra*descuento); 
        }
        else if (color_bola .equals("amarilla")){
            descuento = (float) 0.25;
            valor_neto_a_pagar = valor_compra - (valor_compra*descuento); 
        }
        else if (color_bola .equals("azul")){
            descuento = (float) 0.5;
            valor_neto_a_pagar = valor_compra - (valor_compra*descuento);
        }
        else{
            descuento = (float) 1.0;
            valor_neto_a_pagar = valor_compra - (valor_compra*descuento);
        }
        System.out.println("Total a pagar: "+ valor_neto_a_pagar);
    }
}

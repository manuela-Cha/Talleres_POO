import java.lang.Math;
import java.util.Scanner;
public class Taller_no_1{
    public static void main (String args[]){
        Ejercicicio_No_4(9);
        Ejercicicio_No_5();
        Ejercicicio_No_12();
        Ejercicicio_No_14();
        Ejercicicio_No_17();
    }
     
    public static String Ejercicicio_No_4(int Juan){
        int edadJuan = Juan;
        int edadAlberto = (2 * edadJuan) /3; 
        int edadAna = (4 *edadJuan) /3;
        int edadMama = edadAlberto + edadAna + edadJuan; 
        String frase = "Ejercicio Numero 4 del libro: Edad Juan: " + edadJuan +", Edad Alberto: "+ edadAlberto + ", Edad Ana: "+ edadAna +", Edad mama: " +edadMama + "\n----------";
        System.out.println(frase);
        return frase;
    }

    public static String Ejercicicio_No_5(){
        double suma = 0;
        double x = 20;
        suma = suma + x;
        int y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + x /y;
        String frase= "Ejercicio Numero 5 del libro: el valor de la suma es: " + suma + "\n----------";
        System.out.println(frase);
        return frase;
    }

    public static String Ejercicicio_No_12(){
        int horas_semana = 48;
        int valor_hora = 5000;
        int horas_mes = horas_semana * 4;
        double salario_bruto = horas_mes * valor_hora;
        double retencion_en_la_fuente = salario_bruto * 0.125;
        double salario_neto = salario_bruto - retencion_en_la_fuente;
        String frase = "Ejercicio Numero 12 del libro: Salario bruto: "+salario_bruto + ", Salario neto: "+ salario_neto + ", Retenciones en la fuente: "+ retencion_en_la_fuente + "\n----------"; 
        System.out.println(frase);
        return frase;
    }

    public static String Ejercicicio_No_14(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio Numero 14 del libro: Ingrese un número:");    
        double numero = entrada.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        String frase = "numero " + numero + " elevado al cuadrado: "+ cuadrado + ", elevado al cubo: "+ cubo + "\n----------"; 
        System.out.println(frase);
        return frase;
    }

    public static String Ejercicicio_No_17(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio Numero 17 del libro: Ingrese el radio del circulo: ");    
        double radio = entrada.nextDouble();
        double area_circulo = Math.pow(radio, 2) * Math.PI;
        double logitud_de_circunferencia = Math.PI * (radio*2);
        String frase = "Area del circulo: "+ area_circulo + ", Longitud de la circunferencia: "+ logitud_de_circunferencia; 
        System.out.println(frase);
        return frase;
    }


}

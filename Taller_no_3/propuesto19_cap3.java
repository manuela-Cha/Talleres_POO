package Taller_no_3;

public class propuesto19_cap3 {
    public static void main(String args[]){
        triangulo(3.0);
    }

    public static void triangulo (double lado){
        double perimetro = lado*3;
        double altura = lado * Math.sqrt(3/2);
        double area = (lado*lado)/2;

        String frase = "Altura: "+ altura + "\nPerimetro: "+ perimetro + "\nArea del triangulo: "+ area;
        
        System.out.println(frase);
    }
}
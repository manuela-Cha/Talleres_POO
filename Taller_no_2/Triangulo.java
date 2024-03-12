public class Triangulo {
    double Lado_triangulo;
    public Triangulo (double lado) {
        Lado_triangulo = lado;
    }

    public static void main (String args[]){
        Triangulo triangulo = new Triangulo(12);
        operaciones_triangulo(triangulo.Lado_triangulo);
    }

    public static void operaciones_triangulo (double lado){
        double perimetro = 3*lado;
        double valor_altura = (Math.sqrt(3)*lado)/2;
        double area = (lado*valor_altura)/2;

        String frase =  "Perimetro del triángulo: "+perimetro+ "\nValor de la altura del triángulo: "+valor_altura+ "\nArea del triángulo: "+area;
        
        System.out.println(frase);
    } 


}

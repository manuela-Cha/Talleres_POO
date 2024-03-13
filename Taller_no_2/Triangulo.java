public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }  

    public static void main(String args[]){
        Triangulo triangulo = new Triangulo(3, 4, 5);
        operaciones_triangulo(triangulo.lado1,triangulo.lado2 , triangulo.lado3);
    } 
    
    public static void operaciones_triangulo(double lado1, double lado2, double lado3){
        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro*((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
    
        String frase = "Perimetro: "+ perimetro +"\n Semiperimetro: "+semiperimetro+ "\nArea: "+ area;
        System.out.println(frase);
    }
}

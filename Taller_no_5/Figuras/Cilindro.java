
package Taller_no_5.Figuras;


public class Cilindro extends FiguraGeometrica {
    
    private double radio;
    private double altura;
    
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    public double calcularVolumen(){
        double volumen = Math.PI*altura*Math.pow(radio, 2.0);
        return volumen;
    }
    
    public double calcularSuperficie(){
        double areaLadoA = 2.0 * Math.PI * radio * altura;
        double areaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        double superficie = areaLadoA + areaLadoB;
        return superficie;
    }
}
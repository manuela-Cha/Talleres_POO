package Taller_no_5.Notas;

public class Notas {
    double[] listaNotas;
    
    public Notas() {
        listaNotas = new double[5]; 
    }
    
    double calcularPromedio(double lista[]) {
        double suma = 0;
        for(double i : listaNotas) { 
            suma += i; 
        }
        return (suma / listaNotas.length);
    }
    
    double calcularDesviación(double lista[]) {
        double prom = calcularPromedio(lista); 
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); 
    }
   
    double calcularMenor() {
        double menor = listaNotas[0]; 
        for(int i=0; i < listaNotas.length; i++) { 
            if (listaNotas[i] < menor) {
                menor = listaNotas[i];
            }
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas[0]; 
        for(int i=0; i < listaNotas.length; i++) { 
            if (listaNotas[i] > mayor) {
            mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
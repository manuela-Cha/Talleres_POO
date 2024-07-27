package Taller_no_3;

public class propuesto18_cap3 {
    public static void main(String args[]){
        informacion_empleado(1024, "Manuela", 10.0, 1000.0, 0.2);
    }

    public static void informacion_empleado(int codigo, String nombre, double numero_horas_trabajadas_mes, double valor_hora_trabajada, double retencion_en_fuente){
        double salario_bruto = valor_hora_trabajada * numero_horas_trabajadas_mes;
        double salario_neto = salario_bruto - salario_bruto*retencion_en_fuente;
        String frase = "Codigo: "+ codigo + "\nNombre: "+ nombre + "\nSalario bruto: " + salario_bruto +
         "\nsalario neto: " + salario_neto;

        System.out.println(frase);
    }   
}
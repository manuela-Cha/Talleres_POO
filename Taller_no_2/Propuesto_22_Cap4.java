public class Propuesto_22_Cap4 {
    public static void main (String args[]){
        impresion_por_pantalla("Manuela", 8000.0, 188.0 );
    }

    public static void impresion_por_pantalla (String nombre, Double salario_por_hora, Double numero_horas_trabajadas_mes ){
        Double pago_total_mes = salario_por_hora*numero_horas_trabajadas_mes;
        if (pago_total_mes > 450000){
            System.out.println("Nombre: "+nombre+"\nSalario mensual: "+pago_total_mes);
        }
        else{
            System.out.println("Nombre: "+nombre);            
        }
    }
}

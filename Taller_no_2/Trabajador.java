public class Trabajador {
    public static void main(String args[]){
        calculo_a_pagar("Santiago", 53, 4000);
    }

    public static void calculo_a_pagar (String nombre, float numero_horas_trabajadas, float valor_hora_trabajada ){
        float valor_a_pagar = 0;
        //float horas_exedentes = numero_horas_trabajadas - 40;
        
        if (numero_horas_trabajadas > 40){
            if (numero_horas_trabajadas - 40 <= 8){
                valor_a_pagar = (numero_horas_trabajadas - 40)*2*valor_hora_trabajada + 40*valor_hora_trabajada;
            } 
            else{
                valor_a_pagar = valor_hora_trabajada*40 + (16*valor_hora_trabajada) + ((numero_horas_trabajadas-48)*3*valor_hora_trabajada);
            }
        }
        else{
            valor_a_pagar = numero_horas_trabajadas*valor_hora_trabajada;
        }
        System.out.println("El trabajador "+ nombre + " devengó: "+valor_a_pagar);
    }   

}

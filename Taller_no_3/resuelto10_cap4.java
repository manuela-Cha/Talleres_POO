package Taller_no_3;

public class resuelto10_cap4 {
    public static void main(String args[]){
        pago_matricula(1024, "Manuela", 2000001.0, 4);
    }

    public static void pago_matricula(int numero_inscripcion, String nombre, Double patrimonio, int estrato_social ){
        Double pago_matricula = 50000.0;
        if (patrimonio > 2000000 && estrato_social > 3){
            pago_matricula = pago_matricula + 0.03*patrimonio;
        }
        String frase = "EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + numero_inscripcion + "\nNOMBRE: " + nombre + "\nDEBE PAGAR:"+ pago_matricula;
        System.out.println(frase);
    }

}

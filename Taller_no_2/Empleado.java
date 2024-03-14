public class Empleado {
    int codigo_del_empleado;
    String nombre;
    double numero_de_horas_trabajadas_al_mes;
    double valor_hora_trabajada;
    double porcentaje_de_retención_en_la_fuente;
    public Empleado(int codigo_del_empleado, String nombre, double numero_de_horas_trabajadas_al_mes, double valor_hora_trabajada, 
    double porcentaje_de_retención_en_la_fuente){
        this.codigo_del_empleado = codigo_del_empleado;
        this.nombre = nombre;
        this.numero_de_horas_trabajadas_al_mes = numero_de_horas_trabajadas_al_mes;
        this.valor_hora_trabajada = valor_hora_trabajada;
        this.porcentaje_de_retención_en_la_fuente = porcentaje_de_retención_en_la_fuente;
    }
    
    public static void main(String args[]){
        Empleado empleado = new Empleado(12345, "Manuela", 230, 4.936, 2.5);

        double Salario_neto = (empleado.numero_de_horas_trabajadas_al_mes*empleado.valor_hora_trabajada) - 
        (empleado.numero_de_horas_trabajadas_al_mes*empleado.valor_hora_trabajada)*empleado.porcentaje_de_retención_en_la_fuente/100;
        double salario_bruto = empleado.numero_de_horas_trabajadas_al_mes*empleado.valor_hora_trabajada;

        String frase = "Codigo del empleado: "+empleado.codigo_del_empleado + "\nNombre del empleado: "+empleado.nombre+ "\nSalario bruto : "
        +salario_bruto+ "\nSalario neto: "+Salario_neto;
        System.out.println(frase );
    }
    
}

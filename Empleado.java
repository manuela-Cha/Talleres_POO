public class Empleado {
    int codigo_del_empleado;
    String nombre;
    double numero_de_horas_trabajadas_al_mes;
    double valor_hora_trabajada;
    double porcentaje_de_retención_en_la_fuente;
    public Empleado(int codigo_del_empleado, String nombre, double numero_de_horas_trabajadas_al_mes, double valor_hora_trabajada, double porcentaje_de_retención_en_la_fuente){
        this.codigo_del_empleado = codigo_del_empleado;
        this.nombre = nombre;
        this.numero_de_horas_trabajadas_al_mes = numero_de_horas_trabajadas_al_mes;
        this.valor_hora_trabajada = valor_hora_trabajada;
        this.porcentaje_de_retención_en_la_fuente = porcentaje_de_retención_en_la_fuente;
    }
    
    public static void main(String args[]){
        Empleado empleado = new Empleado(12345, "Manuela", 230, 4.936, 2.5);
        String frase = "Codigo del empleado: "+empleado.codigo_del_empleado + "\nNombre del empleado: "+empleado.nombre+ "\nNumero de horas trabajadas al mes: "
        +empleado.numero_de_horas_trabajadas_al_mes+ "\nValor de la hora trabajada: "+empleado.valor_hora_trabajada+ "\nPorcentaje de retencion en la fuente: "+
        empleado.porcentaje_de_retención_en_la_fuente;
        System.out.println(frase );
    }
    
}

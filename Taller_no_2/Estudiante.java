public class Estudiante {
    int numero_inscripcion;
    String nombre;
    Double patrimonio;
    int estrato;

    public Estudiante(int numero_inscripcion, String nombre, Double patrimonio, int estrato){
        this.numero_inscripcion = numero_inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public static void main(String args[]){
        Estudiante estudiante = new Estudiante(0001, "Juan Pablo", 15000000.0,4);
        calculo_pago(estudiante.numero_inscripcion, estudiante.nombre, estudiante.patrimonio, estudiante.estrato);
    }

    public static void calculo_pago(int numero_inscripcion, String nombre, Double patrimonio, int estrato){
        Double estandar = 50000.0;
        String frase = "Numero de inscripcion: "+numero_inscripcion+"\nNombre: "+nombre+"\nPago de matricula: "+estandar;

        if (patrimonio > 2000000.0 && estrato > 3){
            estandar = estandar + estandar*0.03;
            String frase1 = "Numero de inscripcion: "+numero_inscripcion+"\nNombre: "+nombre+"\nPago de matricula: "+estandar;
            System.out.println(frase1);
        }
        else{
            System.out.println(frase);
        }
    }
}

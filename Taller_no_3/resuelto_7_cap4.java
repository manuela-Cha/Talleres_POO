package Taller_no_3;

public class resuelto_7_cap4 {
    public static void main(String args[]){
        mayor_que(20,25);
    }

    public static void mayor_que(int a, int b){
        String frase;
        if (a > b){
            frase = "A es mayor que B";
        }
        else{
            frase = "A es menor que B";
        }

        System.out.println(frase);
    }
}

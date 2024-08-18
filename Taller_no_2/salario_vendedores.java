import java.util.Scanner;
public class salario_vendedores {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ventas del departamento 1: ");
        Double ventas_dep1 = scanner.nextDouble();
        System.out.println("Ventas del departamento 2: ");
        Double ventas_dep2 = scanner.nextDouble();
        System.out.println("Ventas del departamento 3: ");
        Double ventas_dep3 = scanner.nextDouble();

        System.out.println("Salario de vendedores del departamento 1: ");
        Double salario_vendedores1 = scanner.nextDouble();
        System.out.println("Salario de vendedores del departamento 2: ");
        Double salario_vendedores2 = scanner.nextDouble();
        System.out.println("Salario de vendedores del departamento 3: ");
        Double salario_vendedores3 = scanner.nextDouble();
        scanner.close();
        
        Double Total_ventas = ventas_dep1+ventas_dep2+ventas_dep3;
        Double porcentaje_sobre_las_ventas = Total_ventas*0.33;
        
        if (ventas_dep1 > porcentaje_sobre_las_ventas){
            salario_vendedores1 = salario_vendedores1 + salario_vendedores1*0.2;
        } 
        if (ventas_dep2 > porcentaje_sobre_las_ventas){
            salario_vendedores2 = salario_vendedores2 + salario_vendedores2*0.2;
        }
        if (ventas_dep3 > porcentaje_sobre_las_ventas){
            salario_vendedores3 = salario_vendedores3 + salario_vendedores3*0.2;
        }
        String frase = "Salario departamento 1: "+salario_vendedores1 +
         "\nSalario departamento 2: "+salario_vendedores2+ "\nSalario departamento 3: "+ salario_vendedores3;

        System.out.println(frase);
    }
}

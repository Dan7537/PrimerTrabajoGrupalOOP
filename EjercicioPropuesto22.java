import java.util.Scanner;
public class EjercicioPropuesto22 {
    public static void main(String[] args) {
        String nombres;
        int horas;
        double valor_hora;
        double salario;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombres = ent.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horas = ent.nextInt();
        System.out.println("Ingrese el valor de la hora trabajada: ");
        valor_hora = ent.nextInt();
        salario = horas * valor_hora;
        if (salario > 450000) {
        	System.out.println("Nombre del empleado: " + nombres + " Salario mensual: " + salario);
        }
        else  {
        	System.out.println("Nombre del empleado: " + nombres);
        }
    }
}

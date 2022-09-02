import java.util.Scanner;
public class EjercicioPropuesto18 {
    public static void main(String[] args) {
        
       
        int codigo ;
        String nombres ;
        int horas ;
        Double valor ;
        Double retencion ;
        Double s_bruto ;
        Double s_neto ;
    	
    	
    	
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el codigo del empleado:");
         codigo = ent.nextInt();
        ent.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        nombres = ent.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        horas = ent.nextInt();
        System.out.println("Ingrese el valor de la hora (en pesos):");
        valor = ent.nextDouble();
        System.out.println("Ingrese el porcentaje de la retencion de la fuente:");
        retencion = ent.nextDouble();
        s_bruto = horas * valor;
        s_neto = s_bruto - (s_bruto * (retencion/100));
        
        System.out.println("Nombre del empleado: " + nombres + ".");
        System.out.println("Codigo del empleado: " + codigo + ".");
        System.out.println("Salario bruto: " + s_bruto + ".");
        System.out.println("Salario neto: :" + s_neto + ".");
    }
}

import java.util.Scanner;
public class EercicioResuelto14 {
    public static void main(String[] args) {
        Double dep1;
        Double dep2;
        Double dep3;
        Double salario;
        Double salario_t1;
        Double salario_t2;
        Double salario_t3;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento uno: ");
        dep1 = ent.nextDouble();
        System.out.println("Ingrese las ventas del departamento dos: ");
        dep2 = ent.nextDouble();
        System.out.println("Ingrese las ventas del departamento tres: ");
        dep3 = ent.nextDouble();
        System.out.println("Ingrese el valor del salario: ");
        salario = ent.nextDouble();
        ;
        Double ventast= dep1+dep2+dep3;

		if (dep1/ventast > 0.33) {
        	
        	salario_t1 = salario*1.2;
        }
		else {
			salario_t1=salario;
		}
        if (dep2/ventast > 0.33) {
        	 salario_t2 = salario*1.2;
        }
		else {
			salario_t2=salario;
		}
        if (dep3/ventast > 0.33) {
        	 salario_t3 = salario*1.2;
        }
		else {
			salario_t3=salario;
		}
     	System.out.println("El salario de los empleados del departamento uno es:" + salario_t1);
    	System.out.println("El salario de los empleados del departamento dos es:" + salario_t2);
    	System.out.println("El salario de los empleados del departamento tres es:" + salario_t3);

    }
}

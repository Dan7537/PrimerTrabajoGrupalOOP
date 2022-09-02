
import java.util.Scanner;
public class EjercicioPropuesto12 {

	public static void main(String[] args) {
		
		int salario;
		String nombre;
		int horasTra;
		int valorHo;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		nombre = Sc.nextLine();
		System.out.println("Escribe el numero de horas trabajadas:");
		horasTra = Sc.nextInt();
		Sc.nextLine();
		System.out.println("Escribe el valor de la hora de trabajo:");
		valorHo = Sc.nextInt();
		
		
		if (horasTra > 40) {
			if (horasTra >48){
				salario = valorHo * 40;
				salario +=  valorHo * 8 *2;
				salario += (horasTra-48)*valorHo * 3;
			}
			else {
				salario = valorHo * 40;
				salario +=  valorHo * (horasTra-40) *2;				
			}
		}
		else {
			salario = horasTra * valorHo;
		}
		
		System.out.println("EL TRABAJADOR " +nombre.toUpperCase()+
				" DEVENGO $" + salario);
	}
}

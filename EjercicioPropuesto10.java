
import java.util.Scanner;
public class EjercicioPropuesto10 {
public static void main(String[] args) {
		
		int numInsc;
		int patrimonio;
		Double valEst = 50000.0;
		Double valMatri;
		String nombre;
		Double estrato;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Escriba su numero de inscripcion:");
		numInsc = Sc.nextInt();
		Sc.nextLine();
		System.out.println("Escriba su nombre:");
		nombre = Sc.nextLine();
		System.out.println("Escriba su patrimonio:");
		patrimonio = Sc.nextInt();
		System.out.println("Escriba su estrato:");
		estrato = Sc.nextDouble();
		
		
		if (patrimonio > 2000000 && estrato > 3) {
			valMatri = valEst + (patrimonio * 0.03);
			
		}
		else {
			valMatri = valEst;
			
		}
		
		System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "
				+numInsc + " Y NOMBRE " + nombre.toUpperCase() 
				+ " DEBE PAGAR $" + valMatri);
	
	}

}

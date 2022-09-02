import java.util.Scanner;
public class EjercicioPropuesto15 {
	public static void main(String[] args) {
		
		
		int aPeso;
		int bPeso;
		int cPeso;
		int dPeso;
		String dif;
		String mayorMenor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el peso de la esfera A:");
		aPeso = sc.nextInt();
		System.out.println("Escriba el peso de la esfera B:");
		bPeso = sc.nextInt();
		System.out.println("Escriba el peso de la esfera C:");
		cPeso = sc.nextInt();
		System.out.println("Escriba el peso de la esfera D:");
		dPeso = sc.nextInt();
			

		if(aPeso == bPeso && bPeso == cPeso) {
			dif ="D";
			if (dPeso > aPeso) {
				mayorMenor="MAYOR";
			}
			else {
				mayorMenor="MENOR";
			}
		}
		
		else if(aPeso == bPeso && dPeso == bPeso) {
			dif = "C";
			if (cPeso > aPeso) {
				mayorMenor="MAYOR";
			}
			else {
				mayorMenor="MENOR";
			}
		}
		
		else if(aPeso == cPeso && aPeso == dPeso) {
			dif = "B";
			if (bPeso > aPeso) {
				mayorMenor="MAYOR";
			}
			else {
				mayorMenor="MENOR";
			}
		}
		else {dif = "A";
			if (aPeso > bPeso) {
				mayorMenor="MAYOR";
			}
			else {
				mayorMenor="MENOR";
			}
			
		}
		
		System.out.println("LA ESFERA "+dif +" ES LA DIFERENTE Y "
				+ "ES DE "+mayorMenor+" PESO ");
		
	}
}

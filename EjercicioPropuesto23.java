import java.util.Scanner;

public class EjercicioPropuesto23 {

	
	public static void main(String[] args) {
		
		int avalor;
		int bvalor;
		int cvalor;
		double valorpo;
		double valorne;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de  A:");
		avalor = sc.nextInt();
		System.out.println("Escriba el valor de  B:");
		bvalor = sc.nextInt();
		System.out.println("Escriba el valor de  C:");
		cvalor = sc.nextInt();
		
		valorpo= (-bvalor+(Math.sqrt(Math.pow(bvalor,2)+(4*avalor*cvalor))))/(2*avalor);
		valorne= (-bvalor-(Math.sqrt(Math.pow(bvalor,2)+(4*avalor*cvalor))))/(2*avalor);
		
		System.out.println("LAS POSIBLES SOLUCIONES DE LA ECUACION SON:"+valorpo + " Y " + valorne);
		
		
	}
}

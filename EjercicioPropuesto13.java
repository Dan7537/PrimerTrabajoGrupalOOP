import java.util.Scanner;
public class EjercicioPropuesto13 {
	public static void main(String[] args) {
		
		double valorComp;
		String colorBo;
		double descuento;
		double valorConDes;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Escribe el valor de la compra:");
		valorComp = Sc.nextDouble();
		Sc.nextLine();
		System.out.println("Escribe el color de la bolita:");
		colorBo = Sc.nextLine().toLowerCase();
		descuento = 0.0;

			
		
		if (colorBo.equals("blanco") ) {
			descuento = 0;
		}
		else if(colorBo.equals("verde")){
			descuento = 0.10;
		}
		else if(colorBo.equals("amarillo")){
			descuento = 0.25;
		}
		else if(colorBo.equals("azul")){
			descuento = 0.50;
		}
		else {
			descuento = 1.0;
		}
						
		
		valorConDes = valorComp - (valorComp*descuento);
		System.out.println("EL CLIENTE DEBE PAGAR:$" + valorConDes);
		
		
		
		
		
		
	}
}

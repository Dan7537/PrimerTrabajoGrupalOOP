package Poo;

public class PruebaFiguras {
	
	public static void main(String args[]) {
		Círculo figura1 = new Círculo(2);
		Rectángulo figura2 = new Rectángulo(1,2);
		Cuadrado figura3 = new Cuadrado(3);
		TriánguloRectángulo figura4 = new TriánguloRectángulo(3,5);
		Rombo figura5 = new Rombo(5,4);
		Trapecio figura6 = new Trapecio(8,6,4);
		System.out.println("El área del círculo es = " + figura1.
		calcularArea());
		System.out.println("El perímetro del círculo es = " + figura1.
		calcularPerímetro());
		System.out.println();
		System.out.println("El área del rectángulo es = " + figura2.
		calcularArea());
		System.out.println("El perímetro del rectángulo es = " + figura2.
		calcularPerímetro());
		System.out.println();
		System.out.println("El área del cuadrado es = " + figura3.
		calcularArea());
		System.out.println("El perímetro del cuadrado es = " + figura3.
		calcularPerímetro());
		System.out.println();
		System.out.println("El área del triángulo es = " + figura4.
		calcularArea());
		System.out.println("El perímetro del triángulo es = " + figura4.
		calcularPerímetro());
		figura4.determinarTipoTriángulo();
		System.out.println();
		System.out.println("El área del rombo es = " + figura5.
		calcularArea());
		System.out.println("El perímetro del rombo es = " + figura5.
		calcularPerímetro());
		System.out.println();
		System.out.println("El área del trapecio es = " + figura6.
		calcularArea());
		System.out.println("El perímetro del trapecio es = " + figura6.
		calcularPerímetro());	
	}

}

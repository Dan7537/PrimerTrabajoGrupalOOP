package Poo;

public class PruebaFiguras {
	
	public static void main(String args[]) {
		Círculo figura1 = new Círculo(2);
		Rectángulo figura2 = new Rectángulo(1,2);
		Cuadrado figura3 = new Cuadrado(3);
		TriánguloRectángulo figura4 = new TriánguloRectángulo(3,5);
		Rombo figura5 = new Rombo(5,4);
		Trapecio figura6 = new Trapecio(8,6,4);
		System.out.println("El area del circulo es = " + figura1.
		calcularArea());
		System.out.println("El perimetro del circulo es = " + figura1.
		calcularPerímetro());
		System.out.println();
		System.out.println("El area del rectangulo es = " + figura2.
		calcularArea());
		System.out.println("El perimetro del rectangulo es = " + figura2.
		calcularPerímetro());
		System.out.println();
		System.out.println("El area del cuadrado es = " + figura3.
		calcularArea());
		System.out.println("El perimetro del cuadrado es = " + figura3.
		calcularPerímetro());
		System.out.println();
		System.out.println("El area del triangulo es = " + figura4.
		calcularArea());
		System.out.println("El perimetro del triangulo es = " + figura4.
		calcularPerímetro());
		figura4.determinarTipoTriángulo();
		System.out.println();
		System.out.println("El area del rombo es = " + figura5.
		calcularArea());
		System.out.println("El perimetro del rombo es = " + figura5.
		calcularPerímetro());
		System.out.println();
		System.out.println("El area del trapecio es = " + figura6.
		calcularArea());
		System.out.println("El perimetro del trapecio es = " + figura6.
		calcularPerímetro());	
	}

}

import java.util.Scanner;
public class EjercicioPropuesto19 {
    public static void main(String[] args) {
        
    	Double X;
    	Double perimetro;
    	Double altura;
    	Double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado: ");
        X = sc.nextDouble();
        perimetro = X * 3;
        altura = Math.sqrt(Math.pow(X, 2)-Math.pow(X/2, 2));
        area =  (X*altura)/2;
        System.out.println("El perimetro del trangulo equilatero es: " + perimetro);
        System.out.println("La altura del traingulo equilatero es: " + altura);
        System.out.println("El area del traingulo equilatero es: " + area);

    }
}
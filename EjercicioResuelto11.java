import java.util.Scanner;
public class EjercicioResuelto11 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        A = ent.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        B = ent.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        C = ent.nextInt();
        if (A > B && A > C) {
        	System.out.println("El mayor es " + A);
        }
        else if (B > A && B > C) {
        	System.out.println("El mayor es " + B);
        }
        else if (C > A && C > B) {
        	System.out.println("El mayor es " + C);
        }
    }
}

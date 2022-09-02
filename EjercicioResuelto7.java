import java.util.Scanner;
public class EjercicioResuelto7 {
    public static void main(String[] args) {
        double A;
        double B;
        double X;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el primer numero (A): ");
        A = ent.nextDouble();
        System.out.println("Ingrese el segundo numero (B): ");
        B = ent.nextDouble();
        X = A - B;
        if (A  > B) {
        	System.out.println("A es mayor que B");
        }
        else if (A < B) {
        	System.out.println("A es menor que B");
        }
        else  {
        	System.out.println("A es igual que B");
        }
       
    }
}

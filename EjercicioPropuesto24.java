import java.util.Scanner;
public class EjercicioPropuesto24 {
    public static void main(String[] args) {
        Double esf1;
        Double esf2;
        Double esf3;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera 1: ");
        esf1 = ent.nextDouble();
        System.out.println("Ingrese el peso de la esfera 2: ");
        esf2 = ent.nextDouble();
        System.out.println("Ingrese el peso de la esfera 3: ");
        esf3 = ent.nextDouble();
        if (esf1 > esf2 && esf1 > esf3) {
        	System.out.println("La mas pesada es la esfera 1");
        }
        else if (esf2 > esf1 && esf2 > esf3) {
        	System.out.println("La mas pesada es la esfera 2");
        }
        else if (esf3 > esf1 && esf3 > esf2) {
        	System.out.println("La mas pesada es la esfera 3");
        }
    }
}
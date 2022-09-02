import java.util.Scanner;
public class EjercicioPropuesto21 {
    public static void main(String[] args) {
        Double X;
        Double Y;
        Double Z;
        Double perimetro;
        Double semi;
        Double area;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado 1: ");
        X = ent.nextDouble();
        System.out.println("Ingrese la medida del lado 2: ");
        Y = ent.nextDouble();
        System.out.println("Ingrese la medida del lado 3: ");
        Z = ent.nextDouble();
        perimetro = X + Y + Z;
        semi = perimetro / 2;
        area = (X*Y)/2;
        
        
        
        if(X == Y && X == Z){
            area = Math.sqrt(3 / 4) * X;
            }
        
        else if(X != Y && X != Z && Z!=Y){ area = (Y * Z) / 2;  
        }
        
        else{area = (Y * Math.sqrt(Math.pow(3, 2) - (Math.pow(2, 2) / 4))) / 2;
        }
        
        
        
        
        
        
        System.out.println("El perimetro del trangulo equilatero es: " + perimetro);
        System.out.println("El semiperimetro del triangulo es: " + semi);
        System.out.println("El area del triangulo equilatero es: " + area);
    }
}

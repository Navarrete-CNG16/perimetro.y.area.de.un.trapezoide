package perimetro.y.area.de.un.trapezoide;
import java.util.Scanner;
public class PerimetroYAreaDeUnTrapezoide {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double a,b,c,d,d1,d2,P,A;
        System.out.println("Dame el valor de a: ");
        a = S.nextDouble();
        System.out.println("Dame el valor de b: ");
        b = S.nextDouble();
        System.out.println("Dame el valor de c: ");
        c = S.nextDouble();
        System.out.println("Dame el valor de d: ");
        d = S.nextDouble();
        System.out.println("Dame el valor de d1: ");
        d1 = S.nextDouble();
        System.out.println("Dame el valor de d2: ");
        d2 = S.nextDouble();
        P = a+b+c+d;
        A = (1.0/2.0)*(Math.sqrt(4*Math.pow((d1*d2),2)-Math.pow(Math.pow(a,2)-Math.pow(b,2)+Math.pow(c,2)-Math.pow(d,2),2)));
        System.out.println("El perimetro del trapezoide es: "+P);
        System.out.println("El area de trapezoide es: "+A);
    }
}
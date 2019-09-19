import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

public class resolution {

    public static void main (String[] args) {

    //variable
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x_1 = 0;
        double x_2 = 0;
        double d;


        //question
        System.out.println("Quel est la variable A?");
        a = sc.nextDouble();
        System.out.println("Quel est la variable B?");
        b = sc.nextDouble();
        System.out.println("Quel est la variable c?");
        c = sc.nextDouble();


        //trouver x_1
        d = (Math.pow(b,2))-(4*a*c);
        x_1 = (((-b) + Math.sqrt(d)) / (2 * a));
        x_2 = (((-b) - Math.sqrt(d)) / (2 * a));

        /*
        a < 60;
        a > 10;
         */



        //
        System.out.println("Équation : " + a + "x2+" + b + "x+" + c + "=0");
        System.out.println("X1 : " + x_1);
        System.out.println("X2 : " + x_2);
        System.out.println("Discriminant : " + d);



    }
}

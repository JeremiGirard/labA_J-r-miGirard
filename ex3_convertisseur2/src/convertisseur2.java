import java.text.DecimalFormat;
import java.util.Scanner;

public class convertisseur2 {

    public static void main(String[] args) {

        //variable
        double rad;
        int deg;
        Scanner sc = new Scanner(System.in);

        //question
        System.out.println("Quel est l'angle en degre?");
        deg = sc.nextInt();


        //operation
        rad = Math.toRadians(deg);


        //resultat
        System.out.println("L'angle en radiant est de " + rad);
        sc.close();
    }
}
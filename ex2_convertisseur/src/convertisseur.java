import java.util.Scanner;

public class convertisseur {

    public static void main(String[] args) {


        //variable
        double rad;
        int deg;
        Scanner sc = new Scanner(System.in);

        //question
        System.out.println("Entrer le radiant : ");
        rad = sc.nextDouble();
        System.out.println();

        //operation
        deg = (int)(180 * (rad / Math.PI));

        //resultat
        System.out.println();
        System.out.println("le radiant est de " + deg);
        sc.close();
    }

}
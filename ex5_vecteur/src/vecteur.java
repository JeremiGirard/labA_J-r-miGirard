import java.util.Scanner;

public class vecteur {

    public static void main(String[]args){

        //variable
        double xa;
        double ya;
        double za;
        double xb;
        double yb;
        double zb;
        double distance;
        Scanner sc = new Scanner(System.in);

        //question
        System.out.println("Quel est la valeur de x_a");
        xa = sc.nextDouble();
        System.out.println("Quel est la valeur de y_a");
        ya = sc.nextDouble();
        System.out.println("Quel est la valeur de z_a");
        za = sc.nextDouble();
        System.out.println("Quel est la valeur de x_b");
        xb = sc.nextDouble();
        System.out.println("Quel est la valeur de y_b");
        yb = sc.nextDouble();
        System.out.println("Quel est la valeur de z_b");
        zb = sc.nextDouble();

        //affichage
        System.out.println("Le point A (" + xa + "," + ya + "," + za + ")");
        System.out.println("Le point B (" + xb + "," + yb + "," + zb + ")");


        //calcul et affichage démarche
        distance = Math.sqrt(Math.pow((xb-xa),2) + (Math.pow((yb-ya),2)) + (Math.pow((zb-za),2)));
        System.out.println("La distance est de " + distance);

    }


}

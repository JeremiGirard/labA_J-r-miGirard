import java.util.Scanner;

public class pythagore {

    public static void main(String[]args) {

        //variabe
        double da;
        double db;
        double dc;
        Scanner sc = new Scanner (System.in);

        //question 1
        System.out.println("Quel est la valeur de A?");
        da = sc.nextDouble();
        System.out.println();

        //question 2
        System.out.println("Quel est la variable B?");
        db = sc.nextDouble();

        //operation
        dc = (Math.pow(da , 2)) + (Math.pow(db , 2));
        dc = Math.sqrt(dc);

        //Resultat
        System.out.print("la valeur de c est de " + dc);
        sc.close();
    }
}

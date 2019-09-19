import java.util.Scanner;

public class salutation{

    public static void main(String[]args) {

        //decleration
        String nom;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name?");
        nom = sc.next();
        System.out.println();

        //result

        System.out.println("hello " + nom);
        sc.close();



    }
}

import java.util.Scanner;

public class experience_verte {

    public static void main(String [] args) {

        //variables
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int co2;
        int k;
        int t1;
        int t2;
        Scanner sc = new Scanner (System.in);

        //question
        System.out.println("Quel est la valeur de A?");
        a = sc.nextInt();
        System.out.println("Quel est la valeur de B?");
        b = sc.nextInt();
        System.out.println("Quel est la valeur de C?");
        c = sc.nextInt();
        System.out.println("Quel est la valeur de D?");
        d = sc.nextInt();
        System.out.println("Quel est la valeur de E?");
        e = sc.nextInt();
        System.out.println("Quel est la valeur de F?");
        f = sc.nextInt();
        System.out.println("Quel est la valeur du co2?");
        co2 = sc.nextInt();




        //affichage quantité début
        System.out.println ("A_0{" + a + "}  B_0{" + b + "}  C_0{" + c + "}  D_0{" + d + "}  E_0{" + e + "}  F_0{"
                + f + "}  CO2_0{" + co2 + "}");

        //trouver le K
         t1 = a/2;
         t2 = c/4;
         k = Math.min(t1,t2);

        //reaction 1
        a -= 2*k;
        c -= 4*k;
        d += 3*k;
        co2 = k;
        
        //affichage résultat  apres reaction 1
        System.out.println("-------------------------------------------------");
        System.out.println("R1 : 2A + 4C => 3D + co2");
        System.out.println(">K : " + k);
        System.out.println("R1 : " + (2*k) + "A + " + (4*k) + "C => " + (3*k) + "D + " + k + "co2");
        System.out.println ("A_1{" + a + "}  B_1{" + b + "}  C_1{" + c + "}  D_1{" + d + "}  E_1{" + e + "}  F_1{"
                + f + "}  CO2_1{" + co2 + "}");

        //k2
        k = 0;
        t1 = 0;
        t2 = 0;

        t1 = b;
        t2 = 2/c;
        k = Math.min(t1,t2);
        t1 = 0;
        t1 = e;
        k = Math.min(k,t1);

        //reation2
        b -= k;
        c -= 2*k;
        e -= k;
        f += 4*k;
        co2 += 4*k;

        //affichage R2
        System.out.println("-------------------------------------------------");
        System.out.println("R2 : B + 2C + E => 4F 4co2");
        System.out.println(">K : " + k);
        System.out.println(">R2 : " + k + "B + " + (2*k) + "C + " + k + "E => " + (4*k) + "F + " + (4*k) + "co2");
        System.out.println ("A_2{" + a + "}  B_2{" + b + "}  C_2{" + c + "}  D_2{" + d + "}  E_2{" + e + "}  F_2{"
                + f + "}  CO2_2{" + co2 + "}");

        //k3
        k = 0;
        t1 = 0;
        t2 = 0;

        t1 = 2*a;
        t2 = f/4;
        k = Math.min(t1,t2);

        //reaction 3
        a -= k/2;
        f -= 4*k;
        b += k;
        e += 4*k;
        co2 += k;

        //affichege r3
        System.out.println("-------------------------------------------------");
        System.out.println("R3 : A/2 + 4F => B + 4E + co2");
        System.out.println(">K : " + k);
        System.out.println(">R3 : " + (k/2) + "a + " + (2*k) + "f => " + k + "B + " + (4*k) + "E + " + k + "co2");
        System.out.println ("A_3{" + a + "}  B_3{" + b + "}  C_3{" + c + "}  D_3{" + d + "}  E_3{" + e + "}  F_3{"
                + f + "}  CO2_3{" + co2 + "}");
        sc.close();


    }
}

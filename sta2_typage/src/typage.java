import java.util.Scanner;

public class typage {

    public static void main(String []args){

        //variable
        int v1 = 1;
        float v2 = 1;
        char v3 = 1;
        Scanner sc = new Scanner(System.in);

        //conversion 1
        //
        Integer.toString(v1);

        //conversion 2
        /*impossible car les booleans sont des variables en true,false yes,no
        alors on peut pas convertir 1 en true ou false
         */

        //conversion 3
        int v2_c3 = (int) v2;

        //conversion 4
        v2 = Math.round(v2);
        //arroundi la
        String v2_c4 = String.valueOf(v2);

        //conversion 5
        char v3_lettre = 'l';
        char v3 = '1';
        int v3int = v3;
        int v3_lettre_int = v3_lettre;




    }
}

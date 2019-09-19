import java.util.Scanner;

public class geometrie{

    public static void main(String[]args){

        //variabe cercle
        double rcercle;
        double scercle;

        //variabe cube
        double lcube;
        double scube;
        double vcube;

        //variabe cylindre
        double rcylindre;
        double hcylindre;
        double scylindre;
        double vcylindre;

        //variabe cone
        double rcone;
        double hcone;
        double acone;
        double scone;
        double vcone;
        Scanner sc = new Scanner(System.in);

        //quetion
        System.out.println("Quel est le rayon du cercle?");
        rcercle = sc.nextDouble();
        System.out.println("Quel est la largeur du cube?");
        lcube = sc.nextDouble();
        System.out.println("Quel est le rayon du cylindre?");
        rcylindre = sc.nextDouble();
        System.out.println("Quel est la hauteur du cylindre?");
        hcylindre = sc.nextDouble();
        System.out.println("Quel est le rayon du cone?");
        rcone = sc.nextDouble();
        System.out.println("Quel est la hauteur du cone?");
        hcone = sc.nextDouble();

        //calcul cercle
        scercle = Math.PI * (Math.pow(rcercle,2));

        //calcul cube
        scube = Math.pow(lcube,2) * 6;
        vcube = Math.pow(lcube,3);

        //calul cylindre
        scylindre = (Math.PI * (Math.pow(rcylindre,2)) * 2) + (2 * Math.PI * rcylindre * hcylindre);
        vcylindre = (Math.PI * Math.pow(rcylindre,2)) * hcylindre;

        //calcul cone
        acone = Math.pow(hcone,2) + Math.pow(rcone,2);
        acone = Math.sqrt(acone);
        scone = (Math.PI * (Math.pow(rcone,2))) + (Math.PI * rcone * acone);
        vcone = ((Math.PI * (Math.pow(rcone,2))) * hcone) / 3;


        System.out.println("Le cercle");
        System.out.println("-Rayon    : " + rcercle);
        System.out.println("-Surface  : " + scercle);
        System.out.println("");

        System.out.println("Le cube");
        System.out.println("-longueur : " + lcube);
        System.out.println("-Surface  : " + scube);
        System.out.println("-Volume   : " + vcube);
        System.out.println("");

        System.out.println("Le cylindre");
        System.out.println("-rayon    : " + rcylindre);
        System.out.println("-hauteur  : " + hcylindre);
        System.out.println("-Surface  : " + scylindre);
        System.out.println("-Volume   : " + vcylindre);
        System.out.println("");

        System.out.println("Le cone");
        System.out.println("-rayon    : " + rcone);
        System.out.println("-hauteur  : " + hcone);
        System.out.println("-apotheme : " + acone);
        System.out.println("-Surface  : " + scone);
        System.out.println("-Volume   : " + vcone);
        sc.close();



    }
}
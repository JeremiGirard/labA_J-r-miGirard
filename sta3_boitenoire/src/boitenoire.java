import java.util.Scanner;

public class boitenoire {

    public static void main(String[]args){

        //cube
        double dcube = 125.0;
        double ptcube;
        double pcube = 375.0;

        //boule
        double mvboule = 3517.0;
        double rboule = 2.15;
        double pboule;
        double dboule;

        //isolant
        double disolant;
        double mvisolant = 13545.88;
        double qisolant;
        double pisolant;

        //calcul boule
        dboule = (4 * Math.PI * (Math.pow(rboule,2)) / 3);
        pboule = mvboule * dboule;

        //calcul isolant
        disolant = dcube - dboule;
        qisolant = disolant * 1000;
        pisolant = mvisolant * disolant;

        //calcul cube
        ptcube = pboule + pcube + pisolant;

        //affichage
        System.out.println("-----------------------------------------------");
        System.out.println("  RAPPORT D'INFORMATION");
        System.out.println("  Spere");
        System.out.println("   - Masse volumique : " + mvboule + " Kg/m3");
        System.out.println("   - Poids           : " + pboule + " Kg");
        System.out.println("   - Rayon           : " + rboule + " m");
        System.out.println("   - Volume          : " + dboule + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   - Masse Volumique : " + mvisolant + " Kg/m3");
        System.out.println("   - Poids           : " + pisolant + " Kg");
        System.out.println("   - Volume          : " + mvisolant + " m3");
        System.out.println("   - Quantite        : " + qisolant + " L");
        System.out.println("  Boite Noire");
        System.out.println("   - Poids           : " + pcube + " Kg");
        System.out.println("   - Volume          : " + dcube + " m3");
        System.out.println("   -Poids total      : " + ptcube + " Kg");
        System.out.println("-----------------------------------------------");




    }

}

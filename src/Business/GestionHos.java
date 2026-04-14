package Business;

import Model.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionHos {

    private ArrayList<Hospitalisation> hospitalisations ;
    private GestionMed gm;
    private GestionPat gp;

    Scanner scanner = new Scanner(System.in);

    public GestionHos(GestionMed gm,GestionPat gp){
        this.gm = gm;
        this.gp = gp;

    }
    public GestionHos(){
        hospitalisations = new ArrayList<Hospitalisation>();
    }

    //gerer les hospi
     void GererHospitalisations(){
        int choix =0;
        while(choix != 3){
            System.out.println("---------------------------------");
            System.out.println(" 1. Ajouter une hospitalisation");
            System.out.println(" 2. Afficher les hospitalisations");
            System.out.println(" 3. Chercher une hospitalisation");
            System.out.println(" 4. Quitter");
            System.out.println();
            System.out.println("-> Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("----------------------------------");


            switch(choix){
                case 1:
                    System.out.println("-->Ajouter une hospitalisation");
                    Hospitalisation hs;
                     hs = AjouterHos();
                    hospitalisations.add(hs);
                    break;
                case 2:
                    //afficher les hospi
                    System.out.println("--> Afficher les hospitalisations");
                    //afficherHos();
                    break;
                case 3:
                   //chercher une hospi
                case 4:
                    //sortir
                    System.out.println("c'est bien quittee");
                    break;
                default:
                    System.out.println("!!invalid input");
            }

        }








    }


    //ajouter des hospi

     Hospitalisation AjouterHos(){
        int choix = 0 ;

        while(choix != 5){
            System.out.println("-----------------------------------");
            System.out.println("Choisi le type de hospitalisation: ");
            System.out.println(" 1.Hospitalisation Complete");
            System.out.println(" 2.Hospitalisation de Jour");
            System.out.println(" 3.Hospitalisation de Nuit");
            System.out.println(" 4.Reanimation");
            System.out.println(" 5.Quitter");
            System.out.print("Je choisis: ");
            choix = scanner.nextInt();
            System.out.println("-----------------------------------");

            if(choix == 5){
                System.out.println("Bien quittee");
                break;
            }

            if (choix < 1 || choix > 5){
                System.out.println("!invalid input");
            }

            //lecture des informations communes entre tous
            Medecin med = new GestionMed().ajouterMed();
            Patient pt = new GestionPat().ajouterPat();

            System.out.println("La date d'entree: ");
            String dateEnt = scanner.next();
            System.out.println("Le motif: ");
            String motif = scanner.next();
            scanner.nextLine();//pour la ligne autamitiquement genere et qui empeche la lecture
            System.out.print("La description: ");
            String des = scanner.nextLine();

            switch(choix){
                case 1:
                    System.out.println("--> Hospitalisation Complete");
                    System.out.println("Duree estimative: ");
                    int dEst = scanner.nextInt();
                    System.out.print("Duree reel");
                    int dReel = scanner.nextInt();
                    return new HospitalisationComplete(med,pt,dateEnt,motif,des,dEst,dReel);
                case 2:
                    System.out.println("--> Hospitalisation de Jour");
                    return new HospitalisationJour(med,pt,dateEnt,motif, des);

                case 3:
                    System.out.println("--> Hospitalisation de Nuit");
                    return new HospitalisationNuit(med,pt,dateEnt,motif,des);
                case 4:
                    System.out.println("--> Reanimation");
                    System.out.println("Duree estimative: ");
                    int dEst1 = scanner.nextInt();
                    System.out.println("Duree Reel: ");
                    int dReel1 =scanner.nextInt();
                    return new Reanimation(med,pt,dateEnt,motif,des,dEst1,dReel1);
            }
        }
        return null;
    }

/*
    //afficher les hospi

     static void afficherHos(){
        System.out.println("Voici la liste des hospitalisations: ");
        for(Hospitalisation h : hospitalisations){
            System.out.println(h);
            System.out.println();
        }
    }



    //chercher




  */



}

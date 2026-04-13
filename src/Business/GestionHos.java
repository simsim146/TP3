package Business;

import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionHos {

    private ArrayList<Hospitalisation> hospitalisations ;
    Scanner scanner = new Scanner(System.in);

    public GestionHos(ArrayList<Hospitalisation> hospitalisations){
        this.hospitalisations = hospitalisations;
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
            System.out.println(" 3. Quitter");
            System.out.println();
            System.out.println("-> Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("----------------------------------");


            switch(choix){
                case 1:
                    //creer une hospi
                    //ajouter l'hospi a la liste
                    System.out.println("-->Ajouter une hospitalisation");
                    Hospitalisation hs;
                   // hs = AjouterHos();
                   // hospitalisations.add(hs);
                    break;
                case 2:
                    //afficher les hospi
                    System.out.println("--> Afficher les hospitalisations");
                    //afficherHos();
                    break;
                case 3:
                    //sortir
                    System.out.println("c'est bien quittee");
                    break;
                default:
                    System.out.println("!!invalid input");
            }

        }








    }


    //ajouter des hospi
     /*Hospitalisation AjouterHos(){
        int choix = 0 ;

        while(choix != 5){
            Medecin med ;
            Patient pt;
            String dateEnt , motif, des;
            int dEst, dReel;
            System.out.println("-----------------------------------");
            System.out.println("Choisi le type de hospitalisation: ");
            System.out.println(" 1.Model.Hospitalisation Complete");
            System.out.println(" 2.Model.Hospitalisation de Jour");
            System.out.println(" 3.Model.Hospitalisation de Nuit");
            System.out.println(" 3.Model.Reanimation");
            System.out.println(" 5.Quitter");
            System.out.print("Je choisis: ");
            choix = scanner.nextInt();
            System.out.println("-----------------------------------");

            switch(choix){
                case 1:
                    //there will be a tiny repitition in this whole switch section that we can optimize later
                    System.out.println("-->Model.Hospitalisation complete: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                   // med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                   // pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();
                    System.out.print("Duree estimative: ");
                    dEst = scanner.nextInt();
                    System.out.print("Duree reel: ");
                    dReel = scanner.nextInt();

                   // return new HospitalisationComplete(med,pt,dateEnt,motif,des,dEst,dReel);

                case 2:
                    System.out.println("-->Model.Hospitalisation de Jour: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                   // med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                  //  pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();

                    return new HospitalisationJour(med,pt,dateEnt,motif,des);

                case 3:
                    System.out.println("-->Model.Hospitalisation de Nuit: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                 //   med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                 //   pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();

                    return new HospitalisationNuit(med,pt,dateEnt,motif,des);

                default :
                    System.out.println("-->Model.Reanimation: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                //    med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                 //   pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();
                    System.out.print("Duree estimative: ");
                    dEst = scanner.nextInt();
                    System.out.print("Duree reel: ");
                    dReel = scanner.nextInt();

                    return new Reanimation(med,pt,dateEnt,motif,des,dEst,dReel);


            }

        }


        return null;
    }*/


    //afficher les hospi
    /*
     static void afficherHos(){
        System.out.println("Voici la liste des hospitalisations: ");
        for(Hospitalisation h : hospitalisations){
            System.out.println(h);
            System.out.println();
        }
    }
     */


    //chercher








}

package Business;

import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionHos {

    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Hospitalisation> hospitalisations ;

    public GestionHos(ArrayList<Hospitalisation> h){
        hospitalisations = new ArrayList<Hospitalisation>(h);
    }

    public void menu(){
        int choix = 0;
        while(choix != 4){
            System.out.println("1- Ajouter une hospitalisation");
            System.out.println("2- Afficher les hospitalisations");
            System.out.println("3- chercher une hospitalisation");
            System.out.println("4- Quitter");
            System.out.println("Je choisis: ");
            choix = Integer.parseInt(scanner.next());

            switch(choix){
                case 1:
                    System.out.println("--> Ajouter une hospitalisation: ");
                    Hospitalisation h = ajouterHos();
                    hospitalisations.add(h);
                    break;
                case 2:
                    System.out.println("--> Afficher les hospitalisations: ");
                case 3:
                    System.out.println("--> CHercher un ehospitalisation: ");
                    break;
                case 4:
                    System.out.println("quitte");
                    break;
            }
        }
    }

    public Hospitalisation ajouterHos(){
        int choix = 0 ;
        Hospitalisation h;

        Medecin med = GestionMed.ajouterMed();
        Patient pt = GestionPat.ajouterPat();

        while(choix != 5){
            System.out.println("Choisi le type de hospitalisation: ");
            System.out.println(" 1.Hospitalisation Complete");
            System.out.println(" 2.Hospitalisation de Jour");
            System.out.println(" 3.Hospitalisation de Nuit");
            System.out.println(" 4.Reanimation");
            System.out.println(" 5.Quitter");
            System.out.print("Je choisis: ");
            choix = Integer.parseInt(scanner.next());

            //lecture des informations communes entre tous

            System.out.println("La date d'entree: ");
            String dateEnt = scanner.next();
            System.out.println("Le motif: ");
            String motif = scanner.next();
            System.out.print("La description: ");
            String des = scanner.nextLine();

            switch(choix){
                case 1:
                    System.out.println("Duree estimative: ");
                    int dEst = Integer.parseInt(scanner.next());
                    System.out.println("Duree reel: ");
                    int dReel = Integer.parseInt(scanner.next());
                    h = new HospitalisationComplete(med,pt,dateEnt,motif,des,dEst,dReel);
                    // hospitalisations.add(h);
                    return h;
                case 2:
                    h = new HospitalisationJour(med,pt,dateEnt,motif, des);
                  //  hospitalisations.add(h);
                    return h;
                case 3:
                    h = new HospitalisationNuit(med,pt,dateEnt,motif,des);
                   // hospitalisations.add(h);
                    return h;
                case 4:
                    System.out.println("Duree estimative: ");
                    int dEst1 = Integer.parseInt(scanner.next());
                    System.out.println("Duree Reel: ");
                    int dReel1 =Integer.parseInt(scanner.next());
                    h = new Reanimation(med,pt,dateEnt,motif,des,dEst1,dReel1);
                  //  hospitalisations.add(h);
                    return h;
            }
        }
        return null;
    }





    /*
    private ArrayList<Hospitalisation> hospitalisations ;


    Scanner scanner = new Scanner(System.in);

    public GestionHos(ArrayList<Hospitalisation> hos){
        hospitalisations = hos;
    }


    //gerer les hospi
     public void GererHospitalisations(){
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
                    AjouterHos();
                    break;
                case 2:
                    //afficher les hospi
                    System.out.println("--> Afficher les hospitalisations");
                    afficherHos();
                    break;
                case 3:
                   //chercher une hospi
                    System.out.println("--a developper--");
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
        Hospitalisation h;

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
            //Medecin med = new GestionMed().ajouterMed();
           // Patient pt = new GestionPat().ajouterPat();

            System.out.println("La date d'entree: ");
            String dateEnt = scanner.next();
            System.out.println("Le motif: ");
            String motif = scanner.next();
            scanner.nextLine();//pour la ligne autamitiquement genere et qui empeche la lecture
            System.out.print("La description: ");
            String des = scanner.nextLine();

            switch(choix){
                case 1:
                    System.out.println("Duree estimative: ");
                    int dEst = scanner.nextInt();
                    System.out.println("Duree reel: ");
                    int dReel = scanner.nextInt();
                    h = new HospitalisationComplete(med,pt,dateEnt,motif,des,dEst,dReel);
                    hospitalisations.add(h);
                    return h;
                case 2:
                    h = new HospitalisationJour(med,pt,dateEnt,motif, des);
                    hospitalisations.add(h);
                    return h;
                case 3:
                    h = new HospitalisationNuit(med,pt,dateEnt,motif,des);
                    hospitalisations.add(h);
                    return h;
                case 4:
                    System.out.println("Duree estimative: ");
                    int dEst1 = scanner.nextInt();
                    System.out.println("Duree Reel: ");
                    int dReel1 =scanner.nextInt();
                    h = new Reanimation(med,pt,dateEnt,motif,des,dEst1,dReel1);
                    hospitalisations.add(h);
                    return h;
            }
        }
        return null;
    }




      void afficherHos(){
        System.out.println("Voici la liste des hospitalisations: ");
        for(Hospitalisation h : hospitalisations){
            System.out.println(h);
            System.out.println();
        }*/

}

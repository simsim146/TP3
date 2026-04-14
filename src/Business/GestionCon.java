package Business;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionCon {

    private ArrayList<Consultation> consultations;
    Scanner scanner = new Scanner(System.in);
    private GestionMed gm;
    private GestionPat gp;

    public GestionCon(GestionMed gm,GestionPat gp){
        this.gm = gm;
        this.gp = gp;

    }

    //gerer les consu
   public  void GererConsultations(){
        int choix = 0;
        while(choix != 3){
            System.out.println("_______________________");
            System.out.println(" 1. Afficher les Consultations");
            System.out.println(" 2. Ajouter une Model.Consultation");
            System.out.println(" 3. Chercher une consultation");
            System.out.println(" 4. Quitter");
            System.out.println();
            System.out.print("Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("_______________________");

            switch(choix){
                case 1:
                    System.out.println("--> Affichage des Consulations");
                    //appeler la fct de l'affichage
                    //cette fonction sera void static qui affichera directement les consultations enregistres:
                    afficherCons();
                    break;
                case 2:
                    System.out.println("--> Ajout des consultations");
                    //appeler la fonction de l'ajout
                    //ajouter la consultation a la liste
                    Consultation temp = AjouterCons();
                    consultations.add(temp);

                    break;
                case 3:
                    System.out.println("--> Chercher une consultation");

                    break;
                case 4:
                    System.out.println("--> bien quitte");
                    break;
                default:
                    System.out.println(" !! INVALID INPUT !! ");
            }
        }



    }


    //ajouter les consu
         Consultation AjouterCons(){
        int choix = 0;
        while(choix != 3){
            System.out.println("Selectionner le type de consultation: ");
            System.out.println("1. Model.Consultation Hospitalier");
            System.out.println("2. Model.Consultation Domicile");
            System.out.println("3. Quitter");
            System.out.print("Je choisi: ");
            choix = scanner.nextInt();

            if( choix == 3){
                System.out.println("c'est bien quitte");
                break;
            }
            if(choix<1 || choix>3){
                System.out.println("invalid input!!!!!!");
            }

            Medecin med = new GestionMed().ajouterMed();
            Patient pat = new GestionPat().ajouterPat();

            //date noite adrees
            System.out.println("La date de consultation est: ");
            String date = scanner.next();
            System.out.println("La note: ");
            String note = scanner.next();
            scanner.nextLine();

            switch(choix){
                case 1:
                    System.out.println("Le service de la consultation est: ");
                    String service = scanner.next();
                    return new ConsultationHopital(med,pat,date,note,service);
                case 2:
                    System.out.println("L'adresse de consultation est : ");
                    String adresse = scanner.next();
                    return new ConsultationDomicile(med,pat,date,note,adresse);
            }

        }



        return null;
    }

    //chercher les
    /**/

    //afficher
         void afficherCons(){
        System.out.println("---------------------------------");
        System.out.println("Voici la liste des consultaions: ");
        System.out.println("---------------------------------");
        for(Consultation c : consultations ){
            int i =1;
            System.out.println("Model.Consultation #"+i);
            System.out.println(c);
            System.out.println(c);
            i++;
        }
        System.out.println("---------------------------------");


    }



}

package Business;

import Model.Consultation;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionCon {

    private ArrayList<Consultation> consultations;
    Scanner scanner = new Scanner(System.in);

    public GestionCon(ArrayList<Consultation> cs){
        consultations = cs;
    }
    public GestionCon(){
        consultations = new ArrayList<Consultation>();
    }

    //gerer les consu
   /* void GererConsultations(){
        int choix = 0;
        while(choix != 3){
            System.out.println("_______________________");
            System.out.println(" 1. Afficher les Consultations");
            System.out.println(" 2. Ajouter une Model.Consultation");
            System.out.println(" 3. Quitter");
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
                    System.out.println("--> bien quitte");
                    break;
                default:
                    System.out.println(" !! INVALID INPUT !! ");
            }
        }



    }*/


    //ajouter les consu
    /*    static Consultation AjouterCons(){
        int choix = 0;
        while(choix != 3){
            System.out.println("Selectionner le type de consultation: ");
            System.out.println("1. Model.Consultation Hospitalier");
            System.out.println("2. Model.Consultation Domicile");
            System.out.println("3. Quitter");
            System.out.print("Je choisi: ");
            choix = scanner.nextInt();

            switch(choix){
                case 1:
                    Patient pat;
                    Medecin med;
                    String date,note, service;
                    System.out.println("--> Model.Consultation Hospitalier");
                    //fct d'ajouter un patient
                    pat = ajouterPat();
                    patients.add(pat);
                    //fct d'ajouter un medecin
                    med = ajouterMed();
                    medecins.add(med);
                    //get other properties
                    System.out.println();
                    System.out.print("Entrer la date du consultation: ");
                    date = scanner.next();
                    System.out.print("Entrer les notes du consultation: ");
                    note = scanner.next();
                    System.out.print("Entrer le service: ");
                    service = scanner.next();

                    //retourner
                    return  new ConsultationHopital(med,pat,date,note,service);

                case 2:
                    System.out.println("--> Model.Consultation Domicile");
                    Patient patd;
                    Medecin medd;
                    String dated, notesd, adresse;
                    //fct d'ajouter un patient
                    patd = ajouterPat();
                    patients.add(patd);
                    //fct d'ajouter un medecin
                    medd = ajouterMed();
                    medecins.add(medd);
                    //get other properties
                    System.out.println();
                    System.out.print("Entrer la date de consultation domicile: ");
                    dated = scanner.next();
                    System.out.print("Entrer les notes de la consultation: ");
                    notesd = scanner.next();
                    System.out.print("Entrer l'adresse de la consultation: ");
                    adresse = scanner.next();

                    return new ConsultationDomicile(medd,patd,dated,notesd,adresse);

                case 3:
                    System.out.println("bien quitte");
                    break;
                default:
                    System.out.println(" !!Invalid Input!! ");
            }

        }



        return new ConsultationDomicile();
    }*/

    //chercher les
    /**/

    //afficher
    /*    static void afficherCons(){
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


    }*/



}

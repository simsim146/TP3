package Business;
import Model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionPat {

    private ArrayList<Patient> patients ;
     Scanner scanner = new Scanner(System.in);

    public GestionPat(ArrayList<Patient> patients){
            this.patients = patients;
    }
    public GestionPat(){
        patients = new ArrayList<Patient>();
    }

    //gerer les patients:
     public void GererPat(){
        int choix = 0;
        while (choix !=4){
            System.out.println("---------------------------");
            System.out.println("La gestion des patients: ");
            System.out.println(" 1. Ajouter un patient");
            System.out.println(" 2. Chercher un patient");
            System.out.println(" 3. Afficher les patients");
            System.out.println(" 4. Quitter");
            System.out.println("Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("----------------------------");

            switch(choix){
                case 1:
                    Patient p;
                    System.out.println("->L'ajout d'un patient");
                   // p = ajouterPat();
                    //patients.add(p);
                    break;
                case 2:
                    System.out.println("->La recherche d'un patient");
                    //chercherPat();
                    break;
                case 3:
                    System.out.println("->L'affichage des patients: ");
                    //afficherPat();
                    break;
                case 4:
                    System.out.println("bien quitte");
                    break;
                default:
                    System.out.println("!!!invalid input");
            }

        }

    }




    //ajouter un patient:
      /*  Patient ajouterPat(){
        String nom;
        int pressionD, pressionS,age;
        float poids, taille;
        boolean diab=true, repeat = true;
        System.out.println("Veuiller entrer les informations du patient: ");
        System.out.print("Le nom du patient: ");
        nom = scanner.next(); //for some very unkown reasons if i use a scanner.nextLine i cant scann an input
        System.out.print("L'age du patient: ");
        age = scanner.nextInt();
        System.out.print("Le poids du patient: ");
        poids = scanner.nextFloat();
        System.out.print("La taille du patient: ");
        taille = scanner.nextFloat();
        System.out.print("La pression Systolyque: ");
        pressionS = scanner.nextInt();
        System.out.print("La pression Diastolique: ");
        pressionD = scanner.nextInt();

        while(repeat){
            System.out.print("Est-ce que le patient est diabetique (Yes/No)? : ");
            String tmp = scanner.next();
            switch(tmp){
                case "Yes":
                    //diab = true;
                    repeat = false;
                    break;
                case "No":
                    diab = false;
                    repeat = false;
                    break;
                default:
                    System.out.println("invalid! \"Yes\" or \"No\" only.");
                    break;
            }
        }

        return new Patient(nom,age,poids,taille,pressionS,pressionD,diab);
    }


    //afficher les patients
     void afficherPat(){
        System.out.println("Voici la liste des patients: ");
        for(Patient p : patients){
            System.out.println(p);
            System.out.println();
        }
    }


    //chercher un patient
     void chercherPat(){
        System.out.println("Entrer le nom du patient a chercher: ");
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Patient p : patients){
            if(p.getNom().equals(nm)){
                System.out.println(p);
            }
        }
    }
*/

}

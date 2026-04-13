import Model.*;
import Business.*;
import java.util.Scanner;

public class Test {

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choix = 0;
        while(choix != 3){
            System.out.println();
            System.out.println();
            System.out.println("======================================");
            System.out.println("Choisir une fonctionnalite (1-2): ");
            System.out.println(" 1. Gerer les consultations");
            System.out.println(" 2. Gerer les hospitalisations");
            System.out.println(" 3. Gerer les patients");
            System.out.println(" 4. Gerer les medecins");
            System.out.println(" 5. Quitter");
            System.out.println("--------------------------------------");
            System.out.print("Je choisis: ");
            choix = scanner.nextInt();
            System.out.println("======================================");

            switch (choix){
                case 1:
                    System.out.println("---> Gerer les consultation");
                    //GererConsultations();
                    break;
                case 2:
                    System.out.println("---> Gerer les hospitalisations");
                    //GererHospitalisations();
                    break;
                case 3:
                    System.out.println("---> Gerer les patients");
                    GestionPat gp = new GestionPat();
                    gp.GererPat();
                    break;
                case 4:
                    System.out.println("---> Gerer les medecins");
                    //GererMed();
                    break;
                case 5:
                    System.out.println("--> bien quitte");
                    break;
                default:
                    System.out.println("!! Invalid input !!");
            }
        }

    }//end main

    //notice that you cant declare a method within the main, cuz main itself is a static method
    // in other words, you cant declare a method within a method


}

//dont forget to close the scanner
//ajouter une recherche des consultations en se basant sur le patient
//mettre les fcts dans un package de business en format d'objets


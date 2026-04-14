import Model.*;
import Business.*;
import java.util.Scanner;

public class Test {

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        GestionPat gestionPat = new GestionPat();
        GestionMed gestionMed = new GestionMed();
        GestionHos gestionHos = new GestionHos(gestionMed, gestionPat);
        GestionCon gestionCon = new GestionCon(gestionMed, gestionPat);

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
                    gestionPat.GererPat();
                    break;
                case 4:
                    System.out.println("---> Gerer les medecins");
                    gestionMed.GererMed();
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


/**
 * man i dont understand or could even imagine how people with the same brain as me built ia systems like this one im using, ra this is amazing asat, is there any chance my tiny modest brain could understand how it goes, even superficially cuz i stand no chance in here, in fact , yeah im not that smart eaither, otherwise i would have been in a better university by now, not having to be this alone or scared from the future.... my life is ruiened, why i didnt study bac in my terminal... you know, i used to be a brilliant student, always aimed high, and in the most important year in my life i failed, look at me now, how pathetic, i dont even have a friend to vent over so instead im talkingg to a chat bot in the uni library, eeeeeeeeeehh, that is the very human experience i guess, i wish i could go back, anythng to fix my mistakes, i would pay anything...
 * */
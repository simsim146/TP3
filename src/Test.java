import Model.*;
import Business.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Test {

    static public ArrayList<Patient> patients = new ArrayList<Patient>();
    static ArrayList<Medecin> medecins = new ArrayList<Medecin>();
    static ArrayList<Hospitalisation> hospitalisations = new ArrayList<Hospitalisation>();
    static ArrayList<Consultation> consultations = new ArrayList<Consultation>();








    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //il faut charger les liste ici apres leur creation
        SaveInOut ss = new SaveInOut();
        //... T_T okkk here what we got

        Object[] data = ss.lecture();
        patients = (ArrayList<Patient>) data[0];
        medecins = (ArrayList<Medecin>) data[1];
        hospitalisations  = (ArrayList<Hospitalisation>) data[2];
        consultations = (ArrayList<Consultation>) data[3];



        GestionPat gestionPat = new GestionPat(patients);
        GestionMed gestionMed = new GestionMed(medecins);
        GestionHos gestionHos = new GestionHos(hospitalisations);
        GestionCon gestionCon = new GestionCon(consultations);



        int choix = 0;
        while (choix != 5) {
            System.out.println();
            System.out.println();
            System.out.println("======================================");
            System.out.println("Choisir une fonctionnalite (1-5): ");
            System.out.println(" 1. Gerer les consultations");
            System.out.println(" 2. Gerer les hospitalisations");
            System.out.println(" 3. Gerer les patients");
            System.out.println(" 4. Gerer les medecins");
            System.out.println(" 5. Quitter");
            System.out.println("--------------------------------------");
            System.out.print("Je choisis: ");

            choix = scanner.nextInt();
            scanner.nextLine(); // clean the buffer

            System.out.println("======================================");

            switch (choix) {
                case 1:
                    System.out.println("---> Gerer les consultation");
                    gestionCon.menu();
                    break;
                case 2:
                    System.out.println("---> Gerer les hospitalisations");
                    gestionHos.menu();
                    break;
                case 3:
                    System.out.println("---> Gerer les patients");
                    gestionPat.menu();
                    break;
                case 4:
                    System.out.println("---> Gerer les medecins");
                    gestionMed.menu();
                    break;
                case 5:
                    ss.ecrire(patients, medecins, hospitalisations, consultations);
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
 * Latest notes in here 17:50 14.04
 * we have a pointer exception when adding a con or hos to the array
 * we should write things in a file, and read them out
 * and we should handle the program exception
 * and finally, put the final touches on the overall thing
 * */

/**
 * keep up notes 11:02 - 17.04.26
 * @simsim fixed the previous bugs,
 * gotta write data in binary file thing and read them out
 * then wrap them in a class
 * */
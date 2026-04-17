import Model.*;
import Business.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Test {

    static void ecritutre(ArrayList<Patient> p,ArrayList<Medecin> m,ArrayList<Hospitalisation> h,ArrayList<Consultation> c){
         try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("/Users/etudiant/Documents/intelliJFiles/data.txt"))){
         oos.writeObject(p); //make them serialisable
         oos.writeObject(m);
         oos.writeObject(c);
         oos.writeObject(h);
         }catch(IOException e){
             e.printStackTrace();
         }
    }

    static void lecture(ArrayList<Patient> p,ArrayList<Medecin> m,ArrayList<Hospitalisation> h,ArrayList<Consultation> c){
        File file = new File("/Users/etudiant/Documents/intelliJFiles/data.txt");
        if(file.exists() && file.length() > 0){
            try( ObjectInputStream ois =  new ObjectInputStream( new FileInputStream(file))){
                p = (ArrayList<Patient>) ois.readObject();
                m = (ArrayList<Medecin>) ois.readObject();
                c = (ArrayList<Consultation>) ois.readObject();
                h = (ArrayList<Hospitalisation>) ois.readObject();
            }catch (IOException e) {
                e.printStackTrace(); // Gestion des erreurs [4, 6]
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if (p == null)
            p = new ArrayList<Patient>();
        if (m == null)
            m = new ArrayList<Medecin>();
        if (c == null)
            c = new ArrayList<Consultation>();
        if (h == null)
            h = new ArrayList<Hospitalisation>();

    }

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<Patient>();
        ArrayList<Medecin> medecins = new ArrayList<Medecin>();
        ArrayList<Hospitalisation> hospitalisations = new ArrayList<Hospitalisation>();
        ArrayList<Consultation> consultations = new ArrayList<Consultation>();


        GestionPat gestionPat = new GestionPat(patients);
        GestionMed gestionMed = new GestionMed(medecins);
        GestionHos gestionHos = new GestionHos(hospitalisations);
        GestionCon gestionCon = new GestionCon(consultations);

        lecture(patients,medecins,hospitalisations,consultations);

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
                    System.out.println("--> bien quitte");
                    ecritutre(patients,medecins,hospitalisations,consultations);
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
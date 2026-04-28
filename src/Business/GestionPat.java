package Business; //comprises the patient classe, its serializable
import Model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionPat {
    static Scanner scanner = new Scanner(System.in);
     static ArrayList<Patient> patients;

    public GestionPat(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void menu() {
        int choix = 0;
        while (choix != 4) {

            System.out.println("1- Ajouter un patient");
            System.out.println("2- Afficher les patients");
            System.out.println("3- Chercher un patient");
            System.out.println("4- Quitter le menu");
            System.out.println("Je choisi: ");
            choix = Integer.parseInt(scanner.next());

            switch (choix) {
                case 1:
                    System.out.println("-->L'ajout d'un patient");
                    //appeler la fct
                    //ajouter automatiquement a la liste
                    ajouterPat();
                    break;
                case 2:
                    System.out.println("--> Affichage des patients");
                    afficherPat();
                    break;
                case 3:
                    System.out.println("--> Chercher des patient");
                    chercher();
                    break;
                case 4:
                    System.out.println("quitee");
                    break;
                default:
                    System.out.println("invalid");
            }
        }


    }

    /**
     * return a patient apres remplissage de champs
     */
     public static Patient ajouterPat() {
        Patient pt;
        String nom;
        int pressionD, pressionS, age;
        float poids, taille;
        System.out.println("Veuiller entrer les informations du patient: ");
        System.out.print("Le nom du patient: ");
        nom = scanner.next();
        System.out.print("L'age du patient: ");
        age = Integer.parseInt(scanner.next());
        System.out.print("Le poids du patient: ");
        poids = Float.parseFloat(scanner.next());
        System.out.print("La taille du patient: ");
        taille = Float.parseFloat(scanner.next());
        System.out.print("La pression Systolyque: ");
        pressionS = Integer.parseInt(scanner.next());
        System.out.print("La pression Diastolique: ");
        pressionD = Integer.parseInt(scanner.next());

        while (true) {
            System.out.print("Est-ce que le patient est diabetique (yes/no)? : ");
            String tmp = scanner.next();
            if (tmp.equals("yes")) {
                pt = new Patient(nom, age, poids, taille, pressionS, pressionD, true);
                patients.add(pt);
                return pt;
            } else if (tmp.equals("no")) {
                pt = new Patient(nom, age, poids, taille, pressionS, pressionD, false);
                patients.add(pt);
                return pt;
            } else {
                System.out.println("invalid input");
            }
        }
    }

    public void afficherPat() {
        System.out.println("Voici la liste des patients: ");
        for (Patient p : patients) {
            System.out.println(p);
            System.out.println();
        }
    }

    public void chercher(){
        System.out.println("Entrer le nom du patient a chercher: ");
        scanner.nextLine();
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Patient p : patients){
            if(p.getNom().equals(nm)){
                System.out.println(p);
            }
        }

    }





}

   /* private ArrayList<Patient> patients ;
    Scanner scanner = new Scanner(System.in);

    public GestionPat(ArrayList<Patient> patients){
            this.patients = patients;
    }

    //gerer les patients:
     public void GererPat(int choix = 1;){

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
                    ajouterPat();
                    break;
                case 2:
                    System.out.println("->La recherche d'un patient");
                    chercherPat();
                    break;
                case 3:
                    System.out.println("->L'affichage des patients: ");
                    afficherPat();
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
        /**this method will add a new patient to the list and return it if needed

public Patient ajouterPat(){

    Patient pt;
    String nom;
    int pressionD, pressionS,age;
    float poids, taille;
    System.out.println("Veuiller entrer les informations du patient: ");
    System.out.print("Le nom du patient: ");
    nom = scanner.next(); //for some very unkown reasons if i use a scanner.nextLine i cant scann an input, solved, kinda, knew the problem origin
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

    while(true){
        System.out.print("Est-ce que le patient est diabetique (Yes/No)? : ");
        String tmp = scanner.next();
        if(tmp.equals("Yes")){
            pt = new Patient(nom,age,poids,taille,pressionS,pressionD,true);
            patients.add(pt);
            return pt;
        }else if(tmp.equals("No")){
            pt = new Patient(nom,age,poids,taille,pressionS,pressionD,false);
            patients.add(pt);
            return pt;
        }else{
            System.out.println("!!!!invalid input");
        }

    }
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
        scanner.nextLine();
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Patient p : patients){
            if(p.getNom().equals(nm)){
                System.out.println(p);
            }
        }
    }
*/

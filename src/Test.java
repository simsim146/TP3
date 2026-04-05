import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Medecin> medecins = new ArrayList<>();
    static ArrayList<Hospitalisation> hospitalisations = new ArrayList<>();
    static ArrayList<Consultation> consultations = new ArrayList<>();

  static void main(String[] args){


    int choix = 0;
    while(choix != 3){
        System.out.println();
        System.out.println();
        System.out.println("======================================");
        System.out.println("Choisir une fonctionnalite (1-2): ");
        System.out.println(" 1. Gerer les consultations");
        System.out.println(" 2. Gerer les hospitalisations");
        System.out.println(" 3. Quitter");
        System.out.println("--------------------------------------");
        System.out.print("Je choisis: ");
        choix = scanner.nextInt();
        System.out.println("======================================");

        switch (choix){
            case 1:
                System.out.println("---> Gerer les consultation");
                GererConsultations();
                break;
            case 2:
                System.out.println("---> Gerer les hospitalisations");
                break;
            case 3:
                System.out.println("--> bien quitte");
                break;
            default:
                System.out.println("!! Invalid input !!");
        }
    }

}
    //notice that you cant declare a method within the main, cuz main itself is a static method
    // in other words, you cant declare a method within a method
    //Fonction pour gerer les consulations

    static void GererConsultations(){
        int choix = 0;
        while(choix != 3){
            System.out.println("_______________________");
            System.out.println(" 1. Afficher les Consultations");
            System.out.println(" 2. Ajouter une Consultation");
            System.out.println(" 3. Quitter");
            System.out.println();
            System.out.print("Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("_______________________");

            switch(choix){
                case 1:
                    System.out.println("--> Affichage des Consulations");
                    //appeler la fct de l'affichage
                    break;
                case 2:
                    System.out.println("--> Ajout des consultations");
                    //appeler la fonction de l'ajout
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



    }
    static Consultation AjouterCons(){
        int choix = 0;
        while(choix != 3){
            System.out.println("Selectionner le type de consultation: ");
            System.out.println("1. Consultation Hospitalier");
            System.out.println("2. Consultation Domicile");
            System.out.println("3. Quitter");
            System.out.print("Je choisi: ");
            choix = scanner.nextInt();

            switch(choix){
                case 1:
                    Patient pat;
                    Medecin med;
                    String date,note, service;
                    System.out.println("--> Consultation Hospitalier");
                    //fct d'ajouter un patient
                    pat = ajouterPat();
                    patients.add(pat);
                    //fct d'ajouter un medecin
                    med = ajouterMed();
                    medecins.add(med);
                    //get other properties
                    System.out.print("Entrer la date du consultation: ");
                    date = scanner.nextLine();
                    System.out.print("Entrer les notes du consultation: ");
                    note = scanner.nextLine();
                    System.out.print("Entrer le service: ");
                    service = scanner.nextLine();

                    //retourner
                    return  new ConsultationHopital(med,pat,date,note,service);

                case 2:
                    System.out.println("--> Consultation Domicile");
                    //fct d'ajouter un medecin
                    //fct d'ajouter un patient
                    //get other properties
                    break;
                case 3:
                    System.out.println("bien quitte");
                    break;
                default:
                    System.out.println(" !!Invalid Input!! ");
            }

        }



     return new ConsultationDomicile();
    }
    static Patient ajouterPat(){
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
    static Medecin ajouterMed(){
        System.out.println("Veuillez Entrer les informations du medecin associe: ");

        String nom, inpe, service, grade, spec, qst;

            System.out.print("Entrer le nom du medecin: ");
            nom = scanner.next();
            System.out.print("Entrer le inpe du medecin: ");
            inpe = scanner.next();
            System.out.println("Entrer le service de medecin: ");
            service = scanner.next();
            System.out.println("Entrer la grade du medecin: ");
            grade = scanner.next();

            while(true){
                System.out.println("Est ce que le medecin est specialiste (yes/no)? : ");
                qst = scanner.next();

                if(qst.equals("yes")){
                    System.out.println("entrer la specialite du medecin: ");
                    spec = scanner.next();
                    //check if chirurgien and then return
                    while(true){
                        System.out.println("Est ce que le medecin est chirurgien? (yes/no): ");
                        String qst2 = scanner.next();
                        if(qst2.equals("yes")){
                            return new MedecinSpecialiste(nom,inpe,service,grade,spec,true);
                        }else if(qst2.equals("no")){
                            return new MedecinSpecialiste(nom,inpe,service,grade,spec,false);
                        }else{
                            System.out.println("Non valide input 'yes' or 'no' only");
                        }
                    }



                }else if(qst.equals("no")){
                    return new MedecinGeneraliste(nom,inpe,service,grade);
                }else{
                    System.out.println("Non valide input 'yes' or 'no' only ");
                }
            }
    }
}

    //dont forget to close the scanner



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
                GererConsultations();
                break;
            case 2:
                System.out.println("---> Gerer les hospitalisations");
                GererHospitalisations();
                break;
            case 3:
                System.out.println("---> Gerer les patients");
                GererPat();
                break;
            case 4:
                System.out.println("---> Gerer les medecins");
                GererMed();
                break;
            case 5:
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



    }
    static void GererHospitalisations(){
        int choix =0;
        while(choix != 3){
            System.out.println("---------------------------------");
            System.out.println(" 1. Ajouter une hospitalisation");
            System.out.println(" 2. Afficher les hospitalisations");
            System.out.println(" 3. Quitter");
            System.out.println();
            System.out.println("-> Je choisi: ");
            choix = scanner.nextInt();
            System.out.println("----------------------------------");


            switch(choix){
                case 1:
                    //creer une hospi
                    //ajouter l'hospi a la liste
                    System.out.println("-->Ajouter une hospitalisation");
                    Hospitalisation hs;
                    hs = AjouterHos();
                    hospitalisations.add(hs);
                    break;
                case 2:
                    //afficher les hospi
                    System.out.println("--> Afficher les hospitalisations");
                    afficherHos();
                    break;
                case 3:
                    //sortir
                    System.out.println("c'est bien quittee");
                    break;
                default:
                    System.out.println("!!invalid input");
            }

        }








    }
    static void GererPat(){
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
                    p = ajouterPat();
                    patients.add(p);
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
                    System.out.println("--> Consultation Domicile");
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
    static void afficherPat(){
        System.out.println("Voici la liste des patients: ");
        for(Patient p : patients){
            System.out.println(p);
            System.out.println();
        }
    }
    static void afficherMed(){
        System.out.println("Voici la liste des medecins: ");
        for(Medecin m : medecins){
            System.out.println(m);
            System.out.println();
        }
    }
    static Medecin ajouterMed(){
        System.out.println("Veuillez Entrer les informations du medecin associe: ");

        String nom, inpe, service, grade, spec, qst;

            System.out.print("Entrer le nom du medecin: ");
            nom = scanner.next();
            System.out.print("Entrer le inpe du medecin: ");
            inpe = scanner.next();
            System.out.print("Entrer le service de medecin: ");
            service = scanner.next();
            System.out.print("Entrer la grade du medecin: ");
            grade = scanner.next();
            System.out.println();

            while(true){
                System.out.print("Est ce que le medecin est specialiste (yes/no)? : ");
                qst = scanner.next();

                if(qst.equals("yes")){
                    System.out.print("entrer la specialite du medecin: ");
                    spec = scanner.next();
                    //check if chirurgien and then return
                    while(true){
                        System.out.print("Est ce que le medecin est chirurgien? (yes/no): ");
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
    static void afficherCons(){
        System.out.println("---------------------------------");
        System.out.println("Voici la liste des consultaions: ");
        System.out.println("---------------------------------");
        for(Consultation c : consultations ){
            int i =1;
            System.out.println("Consultation #"+i);
            System.out.println(c);
            System.out.println(c);
            i++;
        }
        System.out.println("---------------------------------");


    }
    static void afficherHos(){
        System.out.println("Voici la liste des hospitalisations: ");
        for(Hospitalisation h : hospitalisations){
            System.out.println(h);
            System.out.println();
        }
    }
    static Hospitalisation AjouterHos(){
        int choix = 0 ;

        while(choix != 5){
            Medecin med ;
            Patient pt;
            String dateEnt , motif, des;
            int dEst, dReel;
            System.out.println("-----------------------------------");
            System.out.println("Choisi le type de hospitalisation: ");
            System.out.println(" 1.Hospitalisation Complete");
            System.out.println(" 2.Hospitalisation de Jour");
            System.out.println(" 3.Hospitalisation de Nuit");
            System.out.println(" 3.Reanimation");
            System.out.println(" 5.Quitter");
            System.out.print("Je choisis: ");
            choix = scanner.nextInt();
            System.out.println("-----------------------------------");

            switch(choix){
                case 1:
                    //there will be a tiny repitition in this whole switch section that we can optimize later
                    System.out.println("-->Hospitalisation complete: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                    med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                    pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();
                    System.out.print("Duree estimative: ");
                    dEst = scanner.nextInt();
                    System.out.print("Duree reel: ");
                    dReel = scanner.nextInt();

                    return new HospitalisationComplete(med,pt,dateEnt,motif,des,dEst,dReel);

                case 2:
                    System.out.println("-->Hospitalisation de Jour: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                    med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                    pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();

                    return new HospitalisationJour(med,pt,dateEnt,motif,des);

                case 3:
                    System.out.println("-->Hospitalisation de Nuit: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                    med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                    pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();

                    return new HospitalisationNuit(med,pt,dateEnt,motif,des);

                default :
                    System.out.println("-->Reanimation: ");
                    System.out.println();
                    System.out.println("Le medecin consulté: ");
                    med = ajouterMed();
                    System.out.println("Le patient concerne: ");
                    pt = ajouterPat();
                    System.out.print("La date d'entree: ");
                    dateEnt = scanner.next();
                    System.out.print("Le motif: ");
                    motif = scanner.next();
                    System.out.print("La description: ");
                    des = scanner.nextLine();
                    System.out.print("Duree estimative: ");
                    dEst = scanner.nextInt();
                    System.out.print("Duree reel: ");
                    dReel = scanner.nextInt();

                    return new Reanimation(med,pt,dateEnt,motif,des,dEst,dReel);


            }

        }


      return null;
    }
    static void GererMed(){
      int choix = 0;
      while(choix !=4){
          System.out.println("---------------------------");
          System.out.println(" 1. Ajouter un medecin");
          System.out.println(" 2. Chercher un medecin");
          System.out.println(" 3. Afficher les medecins ");
          System.out.println(" 4. Quitter");
          System.out.println("--Je choisis:  ");
          choix = scanner.nextInt();
          System.out.println("----------------------------");

          switch(choix){
              case 1:
                  System.out.println("-->L'ajout d'un medecin: ");
                  Medecin m;
                  m = ajouterMed();
                  medecins.add(m);
              break;
              case 2:
                  System.out.println("-->La recherche d'un medecin: ");
                  chercherMed();
                  break;
              case 3:
                  System.out.println("-->La liste des medecins: ");
                  afficherMed();
                  break;
              case 4:
                  System.out.println("c'est bien quitte");
                  break;
              default:
                  System.out.println("invalid input!!!");
          }



      }


    }
    static void chercherMed(){
        System.out.println("Entrer le nom de medecin a chercher: ");
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Medecin m : medecins){
            if(m.getNom().equals(nm)){
                System.out.println(m);
            }
        }
    }
    static void chercherPat(){
        System.out.println("Entrer le nom du patient a chercher: ");
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Patient p : patients){
            if(p.getNom().equals(nm)){
                System.out.println(p);
            }
        }
    }

}

    //dont forget to close the scanner



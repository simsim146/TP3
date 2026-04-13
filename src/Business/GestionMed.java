package Business;

import Model.Medecin;
import Model.MedecinGeneraliste;
import Model.MedecinSpecialiste;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionMed {

    private ArrayList<Medecin> medecins;
    Scanner scanner = new Scanner(System.in);

    public GestionMed(ArrayList<Medecin> medecins){
        this.medecins = medecins;
    }
    public GestionMed(){
        medecins = new ArrayList<Medecin>();
    }

    //gestion de medecins
    public void GererMed(){
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
                    //m = ajouterMed();
                  //  medecins.add(m);
                    break;
                case 2:
                    System.out.println("-->La recherche d'un medecin: ");
                   // chercherMed();
                    break;
                case 3:
                    System.out.println("-->La liste des medecins: ");
                    //afficherMed();
                    break;
                case 4:
                    System.out.println("c'est bien quitte");
                    break;
                default:
                    System.out.println("invalid input!!!");
            }



        }


    }

    //ajouter un medecin
     Medecin ajouterMed(){
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




    //afficher les medecins
     void afficherMed(){
        System.out.println("Voici la liste des medecins: ");
        for(Medecin m : medecins){
            System.out.println(m);
            System.out.println();
        }
    }


    //chercher les medecins
    void chercherMed(){
        System.out.println("Entrer le nom de medecin a chercher: ");
        String nm = scanner.nextLine();
        System.out.println("Voici le resultat du recherche");
        for(Medecin m : medecins){
            if(m.getNom().equals(nm)){
                System.out.println(m);
            }
        }
    }



}

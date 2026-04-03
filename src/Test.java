import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
public void main(String[] args){

    List<Patient>          patients          = new ArrayList<>();
    List<Medecin>          medecins          = new ArrayList<>();
     List<Consultation>     consultations     = new ArrayList<>();
     List<Hospitalisation>  hospitalisations  = new ArrayList<>();

   Scanner sc = new Scanner(System.in);
    int choix;
    do {
        System.out.println("\n");
        System.out.println("       MENU PRINCIPAL            ");
        System.out.println("  1. Gérer les consultations      ");
        System.out.println("  2. Gérer les hospitalisations   ");
        System.out.println("  0. Quitter                      ");
        System.out.print("Votre choix : ");
        choix = sc.nextInt(); sc.nextLine();

       /* switch (choix) {
            case 1 -> menuConsultations(); //a definir
            case 2 -> menuHospitalisations(); //a definir
            case 0 -> System.out.println("Au revoir !");
            default -> System.out.println("Choix invalide.");
        } */
    } while (choix != 0);



    }
}


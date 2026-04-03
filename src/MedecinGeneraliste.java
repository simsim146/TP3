public class MedecinGeneraliste extends Medecin {

    MedecinGeneraliste(String nom, String INPE, String service, String grade ) {
        super(nom,INPE,service,grade);
    }
    MedecinGeneraliste(){
        super();
    }

    MedecinGeneraliste(MedecinGeneraliste m){
        super(m);
    }

    public String toString() {
        return super.toString()+
                " Il s'agit d'un medecin generaliste";
    }
}

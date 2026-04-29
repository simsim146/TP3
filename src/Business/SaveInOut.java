package Business;
import java.io.*;
import java.util.ArrayList;
import Model.*;

public class SaveInOut {



    public void ecrire(ArrayList<Patient> pt, ArrayList<Medecin> md,
                       ArrayList<Hospitalisation> hs, ArrayList<Consultation> cs) {

        File file = new File("data.bin");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

            out.writeObject(pt);
            out.writeObject(md);
            out.writeObject(hs);
            out.writeObject(cs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object[] lecture() {

        File file = new File("data.bin");

        if (!file.exists()) {
            return new Object[] {
                    new ArrayList<Patient>(),
                    new ArrayList<Medecin>(),
                    new ArrayList<Hospitalisation>(),
                    new ArrayList<Consultation>()
            };
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            return new Object[] {
                    (ArrayList<Patient>) in.readObject(),
                    (ArrayList<Medecin>) in.readObject(),
                    (ArrayList<Hospitalisation>) in.readObject(),
                    (ArrayList<Consultation>) in.readObject()
            };

        } catch (Exception e) {
            e.printStackTrace();

            return new Object[] {
                    new ArrayList<Patient>(),
                    new ArrayList<Medecin>(),
                    new ArrayList<Hospitalisation>(),
                    new ArrayList<Consultation>()
            };
        }
    }



}
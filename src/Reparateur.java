import java.util.ArrayList;
import java.util.List;

public class Reparateur {
    private String name;
    private int yearsOfExperience;

    private ArrayList<Klant> toegewezenReparaties = new ArrayList<>();

    public Reparateur(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void toewijzenReparatie(Klant klant) {
        toegewezenReparaties.add(klant);
        System.out.println("Reparatie toegewezen aan " + name);
    }

    public static Reparateur geefBeschikbareReparateur(List<Reparateur> reparateurs) {
        for (Reparateur reparateur : reparateurs) {
            if (reparateur.toegewezenReparaties.size() == 0) {
                return reparateur;
            }
        }
        return null;
    }
}

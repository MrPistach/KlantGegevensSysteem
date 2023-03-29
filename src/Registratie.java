import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Registratie {
    private Scanner scanner = new Scanner(System.in);
    private List<Reparateur> reparateurs = new ArrayList<>();
    private ArrayList<Klant> klantenlijst = new ArrayList<>();


    public void nieuweReparateur() {
        System.out.println("Geef de naam van de reparateur:");
        String name = scanner.nextLine();

        System.out.println("Geef de ervaring in jaren van de reparateur:");
        int yearsOfExperience = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Er is een nieuw klant geregistreerd met de volgende gegevens:");
        System.out.println("Naam: " + name);
        System.out.println("Ervaring: " + yearsOfExperience);

        reparateurs.add( new Reparateur(name, yearsOfExperience));

    }

    public void nieuweKlantRegistreren() {
        System.out.println("Geef de naam van de klant:");
        String naam = scanner.nextLine();

        System.out.println("Geef het e-mailadres van de klant:");
        String email = scanner.nextLine();

        System.out.println("Geef het telefoonnummer van de klant:");
        int telefoonnummer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Geef de telefoonmodel van de klant:");
        String model = scanner.nextLine();

        Klant klant = new Klant(naam, email, telefoonnummer, model);
        klantenlijst.add(klant);

        Reparatie reparatie = new Reparatie(klant, new Date(), "nog niet begonnen", "");
        reparatie.zetOmschrijving(reparatie);


        Reparateur reparateur = Reparateur.geefBeschikbareReparateur(reparateurs);
        if (reparateur != null) {
            reparateur.toewijzenReparatie(klant);

        }


        System.out.println();
        System.out.println("Er is een nieuw klant geregistreerd met de volgende gegevens:");
        System.out.println("Naam: " + naam);
        System.out.println("Email: " + email);
        System.out.println("Telefoonnummer" + telefoonnummer);
        System.out.println("Model" + model);
        if (reparateur != null) {
            System.out.println("Reparateur: " + reparateur.getName());
        } else {
            System.out.println("Er zijn momenteel geen beschikbare reparateurs.");
        }
    }

}


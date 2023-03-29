import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class KlantenBeheer {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Klant> klantenlijst = new ArrayList<>();

    public void verwijderKlant() {
        Klant teVerwijderenKlant = getKlant();
        if (klantenlijst.contains(teVerwijderenKlant)) {
            klantenlijst.remove(teVerwijderenKlant);
            System.out.println("Klant " + teVerwijderenKlant.getNaam() + " is succesvol verwijderd.");
        } else {
            System.out.println("Klant " + teVerwijderenKlant.getNaam() + " bestaat niet in het systeem.");
        }
    }

    public Klant getKlant() {
        Klant klant = null;
        boolean match = false;
        List<Klant> matches = new ArrayList<>();

        while (!match) {
            System.out.println("Geef de naam van de klant:");
            String input = scanner.nextLine();

            for (Klant x : klantenlijst) {
                if ((x.getNaam()).equals(input)) {
                    matches.add(x);
                }
            }

            if (matches.isEmpty()) {
                System.out.println("Er is geen klant met de naam " + input + " in ons systeem gevonden.");
                break;
            } else if (matches.size() == 1) {
                klant = matches.get(0);
                System.out.println("Het is gelukt om de klant te vinden.");
                break;
            } else {
                System.out.println("Er zijn meerdere klanten gevonden met deze naam.");
                System.out.println("Geef het telefoonnummer van de gewenste klant:");
                int index = scanner.nextInt();

                if (index > 0 && index <= matches.size()) {
                    klant = matches.get(index - 1);
                    System.out.println("Het is gelukt om de klant te vinden.");
                    break;
                } else {
                    System.out.println("Er is geen klant met dit telefoonnummer gevonden.");
                    break;
                }
            }
        }
        return klant;
    }

    public void bewerkKlantgegevens(Klant klant) {
        boolean klaar = false;
        if (klant == null) {
            return;
        }

        while (!klaar) {
            System.out.println("Wat wilt u aanpassen?");
            System.out.println("Kies een gegeven:");
            System.out.println("1. Naam");
            System.out.println("2. Email");
            System.out.println("3. Telefoonnummer");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "naam" -> {
                    System.out.println("Wat is de nieuwe naam van de klant?");
                    String nieuweNaam = scanner.nextLine();
                    klant.setNaam(nieuweNaam);
                    klaar = true;
                }
                case "email" -> {
                    System.out.println("Wat is het nieuwe e-mailadres van de klant?");
                    String nieuweEmail = scanner.nextLine();
                    klant.setEmail(nieuweEmail);
                    klaar = true;
                }
                case "telefoonnummer" -> {
                    System.out.println("Wat is de nieuwe telefoonnummer van de klant?");
                    int nieuweTelefoonnummer = scanner.nextInt();
                    klant.setTelefoonnummer(nieuweTelefoonnummer);
                    klaar = true;
                }
                default -> {
                    System.out.println("Dit is geen gegeven dat u kan wijzigen.");
                    System.out.println("U kan de gegevens naam, email en adres wijzigen.");
                    System.out.println("Wilt u nog een keer proberen een gegeven in te voeren?");
                    System.out.println("1. Ja");
                    System.out.println("2. Nee");
                    String input2 = scanner.nextLine();
                    if (input2.equals("1")) {
                        klaar = false;
                    } else {
                        klaar = true;
                    }
                }
            }
        }
    }
}

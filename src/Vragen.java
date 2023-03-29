import java.util.Scanner;
public class Vragen {
    Scanner scanner = new Scanner(System.in);
    Reparatie reparatie = new Reparatie();

    Reparateur reparateur = new Reparateur();
    Registratie registratie = new Registratie();
    KlantenBeheer klantenBeheer = new KlantenBeheer();
    Klant klant = new Klant();
    public void start() {
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("Welkom bij de klantenbeheer applicatie.");
            System.out.println("Kies een optie:");
            System.out.println("1. Nieuwe klant registreren");
            System.out.println("2. Nieuwe reparateur registreren");
            System.out.println("3. Bestaande klant verwijderen");
            System.out.println("4. Bestaande klant wijzigen");
            System.out.println("5. Bestaande klant zoeken");
            System.out.println("6. Status reparatie wijzigen");
            System.out.println("7. Klant tonen");
            System.out.println("8. Reparateur tonen");
            System.out.println("9. Reparatie tonen");
            System.out.println("10. Stoppen");

            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1 -> registratie.nieuweKlantRegistreren();
                case 2 -> registratie.nieuweReparateur();
                case 3 -> klantenBeheer.verwijderKlant();
                case 4 -> klantenBeheer.bewerkKlantgegevens(klantenBeheer.getKlant());
                case 5 -> klantenBeheer.getKlant();
                case 6 -> {
                    System.out.println("Voer het reparatienummer in:");
                    int reparatieNummer = scanner.nextInt();
                    scanner.nextLine();
                    reparatie.getReparatie(reparatieNummer);
                    if (reparatie == null) {
                      System.out.println("Reparatie niet gevonden.");
                    } else {
                      reparatie.bewerkStatus(reparatie);
                      System.out.println("Status van de reparatie is gewijzigd.");
                    }
                }
                case 7 -> klant.printKlant();
                case 8 -> reparateur.printReparateur();
                case 9 -> reparatie.printReparatie();
                case 10 -> doorgaan = false;
                default -> System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }
}
